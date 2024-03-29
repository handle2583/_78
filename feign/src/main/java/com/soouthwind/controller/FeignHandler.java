package com.soouthwind.controller;

import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.soouthwind.entity.Student;
import com.soouthwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;



    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();

    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
