package com.java.excercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharcter {

    public static <Char> void main(String[] arg){
       String s="oello java ohello";

        String fc = Arrays.stream(s.split("")).filter(c->s.indexOf(c)==s.lastIndexOf(c)).findFirst().get();
        System.out.println(fc);


}}
