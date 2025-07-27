package com.java.demo.program;

import java.util.Arrays;

public class RemoveDupliacteAndReturnSameOrder {

    public static void main(String[] args) {

        String s = "abcdagcjgkss";
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);

    }
}
