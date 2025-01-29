package in.vp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vp.entity.Customer;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmail(String email);

}
