package com.pluralsight.generics._8_advanced.a_type_inference;

import com.pluralsight.generics._8_advanced.Person;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class LambdaExamples
{
    public static void main(String[] args)
    {
        final Person donDraper = new Person("Don Draper", 89);
        final Person peggyOlson = new Person("Peggy Olson", 75);
        final Person bertCooper = new Person("Bert Cooper", 100);

        Predicate<Person> isOld = person -> person.getAge() > 80;
        System.out.println(isOld.test(donDraper));
        System.out.println(isOld.test(peggyOlson));

        List<Person> people = new ArrayList<>();
        people.add(donDraper);
        people.add(peggyOlson);
        people.add(bertCooper);

        final Map<Boolean, Long> oldAndYoungPeople = people.stream()
                .collect(partitioningBy(isOld, counting()));
        System.out.println(oldAndYoungPeople);
    }
}
