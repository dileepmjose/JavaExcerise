package com.java.demo.program;

import java.util.Arrays;
import java.util.Comparator;

public class SentenceMaxLengthWord {

    public static void main(String arg[]){
        String sentence  = "I am commimng from Elasvador";
        String maxlen = Arrays.stream(sentence.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(maxlen);

    }
}
