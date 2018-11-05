package com.pluralsight.generics._1_what_and_why_of_generics;

public class TypeUnsafeExample
{
    public static void main(String[] args)
    {
        CircularBuffer<String> buffer = new CircularBuffer<>(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

//        buffer.offer(1);

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer<String> buffer)
    {
        StringBuilder result = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null)
        {
            result.append(value);
        }

        return result.toString();
    }
}
