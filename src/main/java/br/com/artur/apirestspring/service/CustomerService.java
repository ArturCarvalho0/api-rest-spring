package br.com.artur.apirestspring.service;

import br.com.artur.apirestspring.exception.ResourceNotFoundException;
import br.com.artur.apirestspring.model.CustomerModel;
import br.com.artur.apirestspring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository repository;

    public CustomerModel create(CustomerModel model){
        return repository.save(model);
    }

    public CustomerModel findById(int id){
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(null));
    }

}
