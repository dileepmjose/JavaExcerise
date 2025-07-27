package com.java.demo.program;

import java.util.stream.IntStream;

public class WordReverse {

    public static void main(String arg[]){
        String s ="Hi Java";
        int len = s.length();
        char[] charArray = s.toCharArray();
        IntStream.range(0,len).mapToObj(i->charArray[len-i-1]).forEach(System.out::print);
    }
}
