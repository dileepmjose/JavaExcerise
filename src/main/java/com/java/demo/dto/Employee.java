package com.java.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private Double salary;
    private String gender;
    private String department;

    private List<Address> address;


    public Employee(int id, String alice, List<Address> address1) {
    }
}
