package com.java.excercise;

import java.util.Arrays;
import java.util.Comparator;

public class StringSecondHighestLength {

    public static void main(String arg[]){
        String str = "Hello I am Dileep Jose. I am from Thodupzha";
        String sen = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(sen);
    }


}
