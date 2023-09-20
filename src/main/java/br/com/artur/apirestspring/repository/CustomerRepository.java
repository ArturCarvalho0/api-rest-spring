package br.com.artur.apirestspring.repository;

import br.com.artur.apirestspring.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {



}
