package io.cooligc.mediatype.controller;

import io.cooligc.mediatype.annotation.VersionMapping;
import io.cooligc.mediatype.mediatype.MyMediaType;
import io.cooligc.mediatype.model.Customer;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CustomerController {
    
    
    @GetMapping("/heartbeat")
    public String sayHello(){
        return "hello ! user";
    }


    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable String id){
        return new Customer(id, id+"hello", new Date());
    }

    @GetMapping(value="/customers/v2/{id}", consumes = MyMediaType.CUSTOMER_SERVICE_V2)
    public Customer getCustomerV2(@PathVariable String id){
        return new Customer(id, id+"hello"+"/tv2", new Date());
    }


    @VersionMapping(version="v3", value="/customers/v3/{id}", consumes = MyMediaType.CUSTOMER_SERVICE_V3 ,
            method = RequestMethod.GET)
    public Customer getCustomerV3(@PathVariable String id){
        return new Customer(id, id+"hello"+"/tv3", new Date());
    }




}
