package com.pluralsight.generics._5_wildcards.unbounded;

import com.pluralsight.generics._5_wildcards.bounded.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnboundedUsage
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        List<?> objects = new ArrayList<>();
        objects.add(null);
//        objects.add(new Object());
//        objects.add(new Person("Don Draper", 89));

        System.out.println(objects);
    }

}
