package com.java.excercise;
import dao.ProjectDao;
import dto.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public  class JavaDemo {
    public static void main(String arg[]) {


        ProjectDao p = new ProjectDao();
        p.getEmployee().stream().forEach(System.out::println);


        System.out.println("Highest Salary");
        Optional<Employee> emp = p.getEmployee().stream().max(Comparator.comparingDouble(i -> i.getSalary()));
        emp.ifPresent(System.out::println);


        System.out.println("3rd highest Salary Employee");
        Stream thridHihest = p.getEmployee().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).limit(1);
        thridHihest.forEach(System.out::println);




        System.out.println("Employee Belongs Department Testing");
        List<Employee> testing = p.getEmployee().stream().filter(i -> i.getDepartment().equals("Test")).collect(Collectors.toList());
        testing.stream().forEach(System.out::println);


        System.out.println("Employee Sort Descending Salary");


        List<Employee> sorted = p.getEmployee().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        sorted.stream().forEach(System.out::println);




        System.out.println("Group Employee by Gender ");
        Map<String, List<Employee>> gender = p.getEmployee().stream().collect(Collectors.groupingBy(Employee::getGender));
        gender.forEach((key, value) -> System.out.println("Key=" + key + "------" + "Value=" + value));




        System.out.println("Find count Employee Each department");
        Map<String, Long> countDepartment = p.getEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        countDepartment.forEach((key, value) -> System.out.println("Key=" + key + "------" + "Value=" + value));


        System.out.println("Reverse String ");
        String s = "Hello World";
        System.out.println(new StringBuilder(s).reverse());


        System.out.println("Count unique Chacter in String ");
        String s1 = "Hello World";
        Map<Character, Long> characterCount1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        characterCount1.forEach((key, value) -> System.out.println("Key=" + key + "------" + "Value=" + value));


        System.out.println("Larest Integer in Array ");
        List<Integer> a1 = new ArrayList<Integer>();
        int[] intArray = {5, 3, 8, 1, 2, 10, 3, 8, 1};
        System.out.println("largest Integer in Arry" + Arrays.stream(intArray).max().getAsInt());




        Integer[] intArrays = {1, 0, 0, 1, 0, 1, 0, 0, 0};
        List<Integer> find_one_zero = Arrays.asList(intArrays);
        Map<Integer, Long> mapZero = find_one_zero.parallelStream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapZero.forEach((key, vlue) -> {
            System.out.println(key + "=" + vlue);
        });


        System.out.println("Print Disinact elemts array ");
        IntStream sd = Arrays.stream(intArray).distinct();
        sd.forEach(System.out::println);


        System.out.println("Print Distinact element in List ");
        Integer[] intArrays1 = {8,1, 2, 3, 5,10, 1, 3, 9, 8};
        List<Integer> removeDup = Arrays.asList(intArrays1);
        Set<Integer> set1 = removeDup.stream().collect(Collectors.toSet());
        set1.forEach(System.out::println);
        System.out.println("-------->");
        Arrays.stream(intArrays1).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("-------->");
        int len  = intArrays1.length;
        for(int i=0;i<len;i++){

            for(int j=i+1;j<len;j++){
                if(intArrays1[i]==intArrays1[j]){
                    System.out.println(intArrays1[j]);
                }

            }

            System.out.println("----ccccc---->");

            Integer[] intArr = {8,1, 2, 3, 5,10, 1, 3, 9, 8};

            Arrays.sort(intArr);
            System.out.println(i);
        }



    }






}