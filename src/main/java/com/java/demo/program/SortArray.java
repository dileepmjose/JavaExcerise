package com.java.demo.program;

import java.util.Arrays;

public class SortArray {

    public static void main(String arg[]){
        Integer[] intArray= {70,40,10,20,30,40,50,30,20};
        sortArray(intArray);
        printArray(intArray);
        Arrays.sort(intArray);
    }

    public static void sortArray( Integer[] intArray){
        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray.length;j++){
                int tmp;
                if(intArray[i]<=intArray[j]){
                    tmp = intArray[i] ;
                    intArray[i] = intArray[j];
                    intArray[j] = tmp;
                }
            }}

    }
    public static void printArray(Integer[] intArray){
        Arrays.stream(intArray).forEach(System.out::println);
    }

}
