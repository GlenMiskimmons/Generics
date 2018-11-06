package com.pluralsight.generics._2_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyUlson = new Person("Peggy Olsen", 65);
        Person bertCooper = new Person("Burt Cooper", 100);

        Map<String, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyUlson.getName(), peggyUlson);
        madMen.put(bertCooper.getName(), bertCooper);

        System.out.println(madMen);
        System.out.println(madMen.get("Don Draper"));

        for(String name : madMen.keySet()) {
            System.out.println(name);
        }

        for(Person person : madMen.values()) {
            System.out.println(person);
        }

        for(Map.Entry<String, Person> entry: madMen.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
