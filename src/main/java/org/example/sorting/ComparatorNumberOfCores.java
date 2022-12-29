package org.example.sorting;

import org.example.Laptop;

import java.util.Comparator;

public class ComparatorNumberOfCores implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop, Laptop laptop1) {
        return Integer.compare(laptop.getNumber_of_cores(), laptop1.getNumber_of_cores());
    }
}