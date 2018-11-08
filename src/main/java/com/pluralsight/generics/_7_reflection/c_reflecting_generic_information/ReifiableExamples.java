package com.pluralsight.generics._7_reflection.c_reflecting_generic_information;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReifiableExamples
{
    public static class StringList extends ArrayList<String>
    {

    }

    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        Class<?> arrayListClass = strings.getClass();

        final TypeVariable<? extends Class<?>>[] typeParameters = arrayListClass.getTypeParameters();

        System.out.println(arrayListClass.toString());
        System.out.println(arrayListClass.toGenericString());

        final ParameterizedType arrayListOfString = (ParameterizedType) StringList.class.getGenericSuperclass();
        System.out.println(Arrays.toString(arrayListOfString.getActualTypeArguments()));

    }
}
