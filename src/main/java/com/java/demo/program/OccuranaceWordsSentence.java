package com.java.demo.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranaceWordsSentence {

    public static void main(String arg[]){
        String str = "Hello I am Dileep Jose. I am from Thodupzha";
        List<String> strs =  Arrays.stream(str.split(" ")).collect(Collectors.toList());

         Map<String,Long> m= strs.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         m.entrySet().forEach(k->System.out.println(k.getKey()+"="+k.getValue()));

       /*
       Map<Boolean,Long> s0= strs.stream().collect(Collectors.partitioningBy(i->i.contains("a"),Collectors.counting()));
       System.out.println(s0);

        */

    }


}
