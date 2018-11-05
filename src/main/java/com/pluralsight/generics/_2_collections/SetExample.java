package com.pluralsight.generics._2_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyUlson = new Person("Peggy Olsen", 65);
        Person bertCooper = new Person("Burt Cooper", 100);

        Set<Person> madMen = new HashSet<>();
        madMen.add(donDraper);
        madMen.add(peggyUlson);
        madMen.add(donDraper);

        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen.contains(bertCooper));

        for(Person person : madMen) {
            System.out.println(person);
        }
    }
}
