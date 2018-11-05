package com.pluralsight.generics._2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ListExamples {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyUlson = new Person("Peggy Olsen", 65);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyUlson);

        System.out.println(madMen);

        madMen.add(new Person("Burt Cooper", 100));

        System.out.println(madMen);

//        madMen.add(new Object());

        System.out.println(madMen.size());
        System.out.println(madMen.get(0));
        System.out.println(madMen.get(2));

//        final Person person = madMen.get(2);
//        System.out.println(person);

        for(int i = 0; i < madMen.size(); i++) {
            System.out.println(madMen.get(i));
        }

        final Iterator<Person> iterator = madMen.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(Person person : madMen) {
            System.out.println(person);
        }

    }
}
