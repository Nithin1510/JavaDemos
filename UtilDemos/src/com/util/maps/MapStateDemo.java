package com.util.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStateDemo {
    public static void main(String[] args) {
        Map <String, List<String>> statemap = new HashMap<>();

        statemap.put("Karnataka", Arrays.asList("Bangalore", "Mandya", "Dhavangiri"));
        statemap.put("Andhra Pradesh", Arrays.asList("Vizag", "kadapa", "guntur"));
        statemap.put("Tamil Nadu", Arrays.asList("Chennai", "vellore", "Coimbatore", "Trichi"));
        statemap.put("Telangana", Arrays.asList("Hyderabad", "Ranga reddy", "secundarabad"));

        System.out.println(statemap.keySet());
        System.out.println(statemap.values());

//        for(List cities: statemap.values()){
//            System.out.println(cities+".......");
//            for(Object city: cities){
//                System.out.println(city);
//            }
//        }

        for(String state: statemap.keySet()){
            System.out.println("State : - > "+state);
            for(String city: statemap.get(state)){
                System.out.println("city : "+city);
            }
        }

    }
}
