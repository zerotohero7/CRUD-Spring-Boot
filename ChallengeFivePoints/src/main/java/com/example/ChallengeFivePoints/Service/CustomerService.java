package com.example.ChallengeFivePoints.Service;


import com.example.ChallengeFivePoints.DAO.RepositoryDAO;
import com.example.ChallengeFivePoints.Response.Response;
import com.example.ChallengeFivePoints.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private RepositoryDAO repositoryDAO;

/*    private int customerIdCount = 1 ;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();*/

    public Customer addCustomer (Customer customer){
     /*   customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;*/

        return  repositoryDAO.save(customer);


    }

    public List<Customer> getCustomers(){
        /*return  customerList;*/

        return   repositoryDAO.findAll();
    }

    public Customer getCustomer(int customerId){

/*
        return customerList.stream().filter(c->c.getCustomerId() == customerId ).findFirst().get();
*/
        Optional<Customer> optionalCustomer = repositoryDAO.findById(customerId);

        if (!optionalCustomer.isPresent())
            throw new Response("Customer is not available ...");


        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId , Customer customer ){
/*        customerList.stream().forEach(c->{
                    if (c.getCustomerId() == customerId){
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });
        return customerList.stream().filter(c->c.getCustomerId() == customerId ).findFirst().get();*/

        customer.setCustomerId(customerId);
        return repositoryDAO.save(customer);

    }

    public void deleteCustomer(int customerId){

/*        customerList.stream().forEach(c->{
                    if (c.getCustomerId() == customerId){
                        customerList.remove(c);
                    }});*/

        repositoryDAO.deleteById(customerId);

    }








}
