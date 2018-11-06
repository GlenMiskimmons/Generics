package com.pluralsight.generics._3_classes_and_interfaces;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T>{
    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
