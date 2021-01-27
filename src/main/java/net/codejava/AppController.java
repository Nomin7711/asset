package net.codejava;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.loader.plan.build.internal.CascadeStyleLoadPlanBuildingAssociationVisitationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	static List<Integer> months = null;
	static {
		months = new ArrayList<>();
		for(int i=1; i<=12; i++) {
			months.add(i);
		}
	}
	
	@GetMapping("")
	public String viewHomePage() {
		return "login";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(@ModelAttribute("userMonth") User user,Model model) {
		String keyword = null;
		return listByPage(model, 1, "id", "asc", keyword, user);
	}
	
	@GetMapping("/users/{pageNumber}")
	public String listByPage( Model model, @PathVariable("pageNumber") int currentPage, @Param("sortField") String sortField, @Param("sortDir") String sortDir, @Param("keyword") String keyword, @Param("user") User user) {
		Page<User> page = listAll(currentPage, sortField, sortDir, keyword, user.getMonth());
		long totalItems = page.getTotalElements();
		int totalPages = page.getTotalPages();
		List<Integer> costList = new ArrayList<>();
		List<User> listUsers = page.getContent();
		for(User u : listUsers) {
//			u.setCosts(month);
//			costList.add((int) u.getCosts(month));
//			System.out.println("coooooooooooosts---------"+user.getMonth());
		}
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalItems", totalItems);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("keyword", keyword);
		model.addAttribute("months", months);
		model.addAttribute("costList", costList);
		String reverseSortDirString = sortDir.equals("asc") ? "desc" : "asc";
		model.addAttribute("reverseSortDir", reverseSortDirString);
		
		return "users";
		
	}
	
	public Page<User> listAll(int pageNumber, String sortField, String sortDir, String keyword, int month) {
		
		Sort sort = Sort.by(sortField);
		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
		Pageable pageable = (Pageable) PageRequest.of(pageNumber-1, 10, sort);
		Page<User> usersPage = userRepo.findAll(keyword,pageable);
		List<User> users = new ArrayList<User>();
		List<Float> costList = new ArrayList<>();
		users = usersPage.getContent();
		if(month==0) {
			for(User u:users) {
				float tempCost = u.getCosts(1);
				u.setCosts(tempCost);
				System.out.println(tempCost);
//				costList.add(u.getCosts(1));
			}
		}
		else {
			for(User u:users) {
				float tempCost = u.getCosts(month);
				u.setCosts(tempCost);
				System.out.println(tempCost);
			}
		}
		
		if(keyword != null) {
			
			return userRepo.findAll(keyword,pageable);
		};
		
		return userRepo.findAll(pageable);
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditUserForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_user");
		Optional<User> user = userRepo.findById((long) id);
		mav.addObject("userObject", user);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") long id) {
		userRepo.deleteById(id);

		return "redirect:/users";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		System.out.print("***************************************" + user.toString());
		userRepo.save(user);

		return "redirect:/users";
	}
	@RequestMapping("/edit/{id}/{costId}")
	public ModelAndView cost(@PathVariable(name = "costId") int id) {
		ModelAndView mav = new ModelAndView("edit_user");
		Optional<User> user = userRepo.findById((long) id);
		mav.addObject("user", user);

		return mav;
	}


}
