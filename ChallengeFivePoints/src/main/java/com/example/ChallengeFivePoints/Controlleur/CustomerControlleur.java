package com.example.ChallengeFivePoints.Controlleur;


import com.example.ChallengeFivePoints.Service.CustomerService;
import com.example.ChallengeFivePoints.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerControlleur {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer postCustomer(@RequestBody Customer customer){

       return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllcustomer(){
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getOneCustomer(@PathVariable("customerId") int customerId){
        return  customerService.getCustomer(customerId);
    }

    @PutMapping(value = "/{customerId}")
    public Customer modifyCustomer(@PathVariable("customerId") int customerId , @RequestBody Customer customer){
        return  customerService.updateCustomer(customerId , customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public void supprimerCustomer(@PathVariable("customerId") int customerId){
         customerService.deleteCustomer(customerId);
    }


}
