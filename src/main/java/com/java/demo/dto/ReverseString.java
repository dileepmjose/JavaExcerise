package com.java.demo.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String arg[]){

         String s = "Hello World";
         char[] carr = s.toCharArray();
         int len = carr.length;

         IntStream.range(0,carr.length).mapToObj(i->s.charAt(len-i-1)).map(String::valueOf).collect(Collectors.joining());
         System.out.println(s);

        List<String> k = IntStream.range(0,carr.length).mapToObj(i->s.charAt(len-i-1)).map(String::valueOf).collect(Collectors.toList());
        k.forEach(System.out::print);


    }
}
