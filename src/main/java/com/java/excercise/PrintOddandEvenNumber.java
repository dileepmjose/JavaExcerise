package com.java.excercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintOddandEvenNumber {

    public static <Char> void main(String[] arg){
       int arr[] = {10,21,32,40,65};
        System.out.println("ODD NUMBER");
        Arrays.stream(arr).filter(i->(i%2) != 0).forEach(System.out::println);
        System.out.println("EVEN NUMBER");
        Arrays.stream(arr).filter(i->(i%2) == 0).forEach(System.out::println);




    }


}
