package org.example;

import java.util.*;

public class ArrayConcepts {

    public static void main(String[] args) {

        List<String> program = Arrays.asList("Java","Phython","Python","Java", "Python");
        avoidDuplicates(program);

    }

    public static Map<String,Integer> avoidDuplicates(List<String> program){

        Map<String,Integer> prgm = new HashMap<>();

        for(String pgm : program){
            Integer count = prgm.get(pgm);

            if(count == null){
                prgm.put(pgm,1);
            }
            else{
                if(count!=null){
                    prgm.put(pgm,++count);
                }
            }
            Set<Map.Entry<String,Integer>> entrySet = prgm.entrySet();
            for(Map.Entry<String,Integer> entry: entrySet){
                if(entry.getValue() > 1){
                    System.out.println("Duplicate Element " + entry.getKey()+ " : "+entry.getValue());
                }
            }

        }
        return prgm;
    }

    public static Map<String, Integer> avoidDuplicatesusingJava8(List<String> program) {
        Map<String, Integer> prgm = new HashMap<>();

        program.forEach(pgm -> prgm.compute(pgm, (key, count) -> count == null ? 1 : ++count));

        prgm.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate Element " + entry.getKey() + " : " + entry.getValue()));

        return prgm;
    }
}
