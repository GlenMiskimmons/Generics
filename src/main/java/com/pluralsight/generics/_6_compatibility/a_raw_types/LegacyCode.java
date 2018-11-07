package com.pluralsight.generics._6_compatibility.a_raw_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("ghi");

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        legacyMethod(ints);

        List<String> strings = list;

        for(String elem : strings) {
            System.out.println(elem);
        }

        final Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            final Object element = iterator.next();

            System.out.println(element);
        }
    }

    public static void legacyMethod(List list) {

    }
}
