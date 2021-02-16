package net.codejava;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AssetRepository extends JpaRepository<Asset, Long>  {
//	@Query("SELECT a FROM Asset a WHERE u.dep_code = ?1")
//	public User findByEmail(int dep_code);
//	public Optional<Asset> findById(Long id);
//	
//	@Query("SELECT a FROM Asset a WHERE "
//			+ "CONCAT(a.dep_code, ' ', a.e_name, ' ', a.asset_name)"
//			+ " LIKE %?1%")
//	public Page<User> findAll(String keyword, Pageable pageable);
	@Override
	List<Asset> findAll();
}
