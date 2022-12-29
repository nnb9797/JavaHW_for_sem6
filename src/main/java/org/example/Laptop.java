package org.example;

import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString

public class Laptop implements loyalty_program {

    private int id;
    private String brand;
    private String model;
    private Double cost;
    private int ram;
    private int number_of_cores;
    private String cpu;
    private String os;

    @Override
    public int get_a_discount(int id) {
        System.out.println("Магазин предоставляет Вам скидку 15% при условии, что стоимость ноутбука не ниже 75 000");
        return id;
    }
}