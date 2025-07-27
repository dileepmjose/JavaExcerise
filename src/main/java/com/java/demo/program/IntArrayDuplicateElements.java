package com.java.demo.program;

import java.util.HashSet;
import java.util.Set;

public class IntArrayDuplicateElements {

    public static void main(String arg[]){
        Integer[] intArray= {10,20,30,40,50,30,20};
        Set<Integer> set1 = new HashSet<Integer>();

        for(Integer a1: intArray){
            if(!set1.add(a1)){
                System.out.println(a1);
            }

            }

    }

}
