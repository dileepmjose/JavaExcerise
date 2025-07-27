package com.java.demo.program;

import java.util.Arrays;
import java.util.Comparator;

public class LengthSecondHighestWordString {

    public static void main(String arg[]){
        String str = "Hello I am Dileep Jose. I am from Thodupzha";
        int l = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get().length();
        System.out.println(l);

    }


}
