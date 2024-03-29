package com.Project.SpringAngular.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Project.SpringAngular.entity.Customer;

@Repository
@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
