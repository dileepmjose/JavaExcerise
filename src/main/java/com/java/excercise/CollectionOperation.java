package com.java.excercise;
import dto.Address;
import dto.Employee;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CollectionOperation
{

    public static void main(String arg[]){
        List<Employee> employee = getEmployee();
        System.out.println("---------List All Employee in Collection-----------------------");

        // List All Employee in Collection
        employee.stream().forEach(System.out::println);

        System.out.println("-----------List All Adrress---------------------");

        // List All Adrress
        employee.stream().forEach(e->e.getAddress().forEach(System.out::println));

        System.out.println("------------Filter the Employee having  Name start with J--------------------");
        // Filter the Employee having  Name start with J

        List<Employee> employeeJ = employee.stream().filter(e->e.getName().startsWith("J")).collect(Collectors.toList());
        employeeJ.stream().forEach(System.out::println);

        System.out.println("-----------Sort the Employee by Name---------------------");


        // Sort the Employee by Street
        employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("-----------Sort the Employee--> Address--> Country---------------------");
        // Sort the Employee--> Address--> Country

        List<Address> sortAddress =  employee.stream().flatMap(e->e.getAddress().stream()).collect(Collectors.toList());
        sortAddress.stream().sorted(Comparator.comparing(Address::getCountry)).forEach(System.out::println);

    }

    private static List<Employee> getEmployee(){
        List<Employee> employee = new ArrayList<>();
        List<Address>  address1= new ArrayList<>();
        List<Address>  address2= new ArrayList<>();
        List<Address>  address3= new ArrayList<>();
        List<Address>  address4 = new ArrayList<>();

        Address add1 = new Address("123 Main St", "New York", "USA");
        Address add2 = new Address("345 Main St", "Paris", "FRANCE");
        Address add3 = new Address("678 Main St", "Mumbai", "INDIA");


        address1.add(add1);
        address1.add(add2);
        address1.add(add3);

        Address add4 = new Address("100 Main St", "Tokyo", "JAPAN");
        Address add5= new Address("200 Main St", "Berlin", "GERMANY");
        Address add6 = new Address("400 Main St", "Rio", "BRAZIL");
        address2.add(add4);
        address2.add(add5);
        address2.add(add6);

        Address add7 = new Address("Yono Main St", "London", "UK");
        Address add8= new Address("Mid Main St", "Ohio", "USA");
        Address add9 = new Address("Eve Main St", "Chennai", "INDIA");

        address3.add(add7);
        address3.add(add8);
        address3.add(add9);

        Address add10 = new Address("Yono Main St", "Seual", "Korea");
        Address add11= new Address("Mid Main St", "Bejgin", "China");
        Address add12 = new Address("Eve Main St", "Neyrobi", "Kenaya");
        address4.add(add10);
        address4.add(add11);
        address4.add(add12);



        Employee emp1 = new Employee(101, "John",2000d,"Male","Testing", address1);
        employee.add(emp1);

        Employee emp2 = new Employee(106, "Zera",4000d,"Female","Development", address2);
        employee.add(emp2);

        Employee emp3= new Employee(108, "Boon",2500d,"Male","Testing", address3);
        employee.add(emp3);

        Employee emp4= new Employee(109, "Zulu",5500d,"Female","Manager", address3);
        employee.add(emp4);

        return employee;
    }




}
