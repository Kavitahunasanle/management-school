package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Customer;
import com.bezkoder.springjwt.payload.request.CustmerReq;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.BankCustRepo;
import com.bezkoder.springjwt.security.services.BankCustService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bank")
public class BankCustController {

    @Autowired
    private BankCustService bankCustService;

    @GetMapping("/getcustomers")
    public List<Customer> getCustomers(){
        return bankCustService.getCustomers();
    }

    @PostMapping("/addcustomer")
    public ResponseEntity<?> addCustomer(@Valid @RequestBody CustmerReq custmerReq){
        return bankCustService.addCustomer(custmerReq);
    }

}
