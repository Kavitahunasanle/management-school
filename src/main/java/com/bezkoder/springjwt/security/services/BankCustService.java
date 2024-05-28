package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.Customer;
import com.bezkoder.springjwt.payload.request.CustmerReq;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.BankCustRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BankCustService {
    @Autowired
    private BankCustRepo bankCustRepo;

    public List<Customer> getCustomers(){
        return bankCustRepo.findAll();
    }

    public ResponseEntity<?> addCustomer(CustmerReq custmerReq){
        Customer cust = new Customer(custmerReq.getCust_name(), custmerReq.getBalance(), custmerReq.getMobile());

        bankCustRepo.save(cust);

        return ResponseEntity.ok(new MessageResponse("Custmer Added Successfully"));
    }
}
