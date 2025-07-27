package com.java.demo.program;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static <Char> void main(String[] arg){
       String countString="HelloJavaohello";
       Map<Character,Integer> countMap = new HashMap<Character,Integer>();
       for( char index: countString.toCharArray()){
           if(countMap.get(index)==null){
               countMap.put(index,1);
           }else {
               countMap.put(index, countMap.get(index) + 1);
           }
       }

       System.out.println("Charcter Count > 2");

       countMap.entrySet().stream().filter(entry->entry.getValue()>2).
               forEach((entry)-> System.out.println(entry.getKey() + "="+entry.getValue()));

    }


}
