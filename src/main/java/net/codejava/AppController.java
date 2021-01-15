package net.codejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	
	public Page<User> listAll(int pageNumber, String sortField, String sortDir, String keyword) {
		Sort sort = Sort.by(sortField);
		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
		Pageable pageable = (Pageable) PageRequest.of(pageNumber-1, 10, sort);
		if(keyword != null) {
			return userRepo.findAll(keyword,pageable);
		}
		return userRepo.findAll(pageable);
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

//	@GetMapping("/users")
//	public String listUsers(Model model) {
//		List<User> listUsers = userRepo.findAll();
//		model.addAttribute("listUsers", listUsers);
//		
//		return "users";
//	}

	@GetMapping("/users")
	public String listUsers(Model model) {
		String keyword = null;
		return listByPage(model, 1, "id", "asc", keyword);
	}
	
	
//	@GetMapping("/users/{keyword}")
//	public String listUsersByKeyword(Model model, @PathVariable("keyword") String keyword) {
//		List<User> users = listAll(keyword);
//		model.addAttribute("listUsers", users);
//		return "users";
//		
////		return listByPage(model, 1, "id", "asc");
//	}
	
	@GetMapping("/users/{pageNumber}")
	public String listByPage(Model model, @PathVariable("pageNumber") int currentPage, @Param("sortField") String sortField, @Param("sortDir") String sortDir, @Param("keyword") String keyword) {
		Page<User> page = listAll(currentPage, sortField, sortDir, keyword);
		long totalItems = page.getTotalElements();
		int totalPages = page.getTotalPages();
		
		List<User> listUsers = page.getContent();
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalItems", totalItems);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("keyword", keyword);
		String reverseSortDirString = sortDir.equals("asc") ? "desc" : "asc";
		model.addAttribute("reverseSortDir", reverseSortDirString);
		
		return "users";
		
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditUserForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_user");
		Optional<User> user = userRepo.findById((long) id);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$"+user);
		mav.addObject("user", user);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") long id) {
		userRepo.deleteById(id);

		return "redirect:/users";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
//		user.setId((long)1);
//		user.setPassword("12345678");
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
