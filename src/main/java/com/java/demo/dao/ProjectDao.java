package com.java.demo.dao;


import java.util.ArrayList;
import java.util.List;

import com.java.demo.dto.Address;
import com.java.demo.dto.Employee;



public class ProjectDao {

    public List<Employee> getEmployee(){
        List<Employee> emp = new ArrayList<>();

        List<Address>  address1= new ArrayList<Address>();
        Address add1 = new Address("123 Main St", "New York", "USA");
        Address add2 = new Address("345 Main St", "Paris", "FRANCE");
        Address add3 = new Address("678 Main St", "Mumbai", "INDIA");
        address1.add(add1);
        address1.add(add2);
        address1.add(add3);

        List<Address>  address2= new ArrayList<Address>();
        Address add21 = new Address("ho Main St", "Chicago", "UA");
        Address add22 = new Address("go Main St", "kolampur", "Malayasis");
        Address add23 = new Address("mo Main St", "tokyo", "JAPAN");
        address2.add(add21);
        address2.add(add22);
        address2.add(add23);

        List<Address>  address3= new ArrayList<Address>();
        Address add31 = new Address("mm Main St", "Durban", "SouthAfraica");
        Address add32 = new Address("do Main St", "Melbone", "Ausralia");
        Address add33 = new Address("fo Main St", "Toronto", "Canada");
        address3.add(add31);
        address3.add(add32);
        address3.add(add33);

        Employee emp1  = new Employee(10,"Jo",800d,"Male","Testing",address1);
        Employee emp2  = new Employee(30,"Mack",900d,"Female","Developemnt",address2);
        Employee emp3  = new Employee(20,"Ark",700d,"Male","Manager",address3);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);

        return emp;

    }
}
