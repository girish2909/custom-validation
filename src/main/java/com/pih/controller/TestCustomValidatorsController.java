package com.pih.controller;

import com.pih.model.Employee;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestCustomValidatorsController {

    @GetMapping("/json-body-validation")
    public String testJsonBody(@Valid @RequestBody Employee employee){
            //, BindingResult result, Model m) {
//            if(result.hasErrors()) {
//                return "phoneHome";
//            }
        return "After Successful validation the message will return with 200 status code";
    }
}
