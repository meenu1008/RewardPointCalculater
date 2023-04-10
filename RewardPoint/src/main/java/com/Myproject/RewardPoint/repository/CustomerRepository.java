package com.Myproject.RewardPoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.Myproject.RewardPoint.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
