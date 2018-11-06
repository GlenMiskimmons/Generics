package com.pluralsight.generics._3_classes_and_interfaces;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    public int compare(Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
