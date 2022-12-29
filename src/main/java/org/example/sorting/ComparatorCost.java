package org.example.sorting;

import org.example.Laptop;

import java.util.Comparator;

public class ComparatorCost implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop, Laptop laptop1) {
        return Double.compare(laptop.getCost(), laptop1.getCost());
    }
}
