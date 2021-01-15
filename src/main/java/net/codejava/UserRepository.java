package net.codejava;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);
	public Optional<User> findById(Long id);
	
	@Query("SELECT u FROM User u WHERE "
			+ "CONCAT(u.lastName, ' ', u.firstName, ' ', u.email)"
			+ " LIKE %?1%")
	public Page<User> findAll(String keyword, Pageable pageable);
	
//	@Query("Select * ")
//	public List<User> getCost(String costName);
}
