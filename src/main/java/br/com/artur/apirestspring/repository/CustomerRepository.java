package br.com.artur.apirestspring.repository;

import br.com.artur.apirestspring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
