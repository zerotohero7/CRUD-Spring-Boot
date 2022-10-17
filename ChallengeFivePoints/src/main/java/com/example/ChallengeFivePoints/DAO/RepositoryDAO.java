package com.example.ChallengeFivePoints.DAO;

import com.example.ChallengeFivePoints.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryDAO extends CrudRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();


}
