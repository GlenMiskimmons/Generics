package com.pluralsight.generics._2_collections;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyUlson = new Person("Peggy Olsen", 65);

        Person[] madMen = {donDraper, peggyUlson};

        System.out.println(Arrays.toString(madMen));

        Person bertCooper = new Person("Burt Cooper", 100);
//        madMen[2] = bertCooper;


        madMen = add(bertCooper, madMen);
        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(final Person person, Person[] array) {
        final int length = array.length;
        array = Arrays.copyOf(array, array.length + 1);
        array[length] = person;

        return array;
    }
}
