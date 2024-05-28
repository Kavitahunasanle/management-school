package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCustRepo extends JpaRepository<Customer, Long> {

}
