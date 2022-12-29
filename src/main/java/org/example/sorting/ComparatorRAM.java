package org.example.sorting;
import org.example.Laptop;

import java.util.Comparator;

public class ComparatorRAM implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop, Laptop laptop1) {
        return Integer.compare(laptop.getRam(), laptop1.getRam());
    }
}
