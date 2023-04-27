package com.pih.model;

import com.pih.validator.ContactNumberConstraint;
import lombok.Data;

@Data
public class Employee {
    private String name;
    private String  age;
    private String address;
    private String sex;
    @ContactNumberConstraint
    private String contactNumber;
}
