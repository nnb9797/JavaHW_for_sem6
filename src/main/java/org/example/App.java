package org.example;

import org.example.sorting.ComparatorCost;
import org.example.sorting.ComparatorNumberOfCores;
import org.example.sorting.ComparatorRAM;

import java.util.*;

public class App
{
    public static void main( String[] args ) {

        Laptop laptop1 = new Laptop(1,"Lenovo", "A17", 34000.00, 16, 8, "Intel",
                "Windows");
        Laptop laptop2 = new Laptop(2,"Acer", "Nitro5", 78000.00, 8, 12, "AMD",
                "Windows");
        Laptop laptop3 = new Laptop(3,"Acer", "Air", 120000.00, 16, 8, "Intel",
                "Linux");
        Laptop laptop4 = new Laptop(4,"Apple", "Air", 47000.00, 4, 6, "Intel",
                "Windows");
        Laptop laptop5 = new Laptop(5,"Apple", "Pro", 36000.00, 16, 12, "AMD",
                "Mac");
        Laptop laptop6 = new Laptop(6,"Lenovo", "K17", 150000.00, 8, 8, "M1",
                "Mac");
        Laptop laptop7 = new Laptop(7,"Asus", "N17", 87000.00, 16, 8, "Intel",
                "Windows");
        Laptop laptop8 = new Laptop(8,"Php", "IO99", 95000.00, 16, 12, "Intel",
                "Linux");
        Laptop laptop9 = new Laptop(9,"Lenovo", "PL89", 99000.00, 8, 16, "Intel",
                "Linux");
        Laptop laptop10 = new Laptop(10,"Apple", "Pro", 23000.00, 16, 12, "M2",
                "Mac");
        Laptop laptop11 = new Laptop(11,"Lenovo", "H7890", 55000.00, 8, 16, "Intel",
                "Windows");
        Laptop laptop12 = new Laptop(12,"Razer", "A458", 129000.00, 16, 12, "Intel",
                "Windows");
        Laptop laptop13 = new Laptop(13,"Apple", "air", 39000.00, 8, 8, "M2",
                "Mac");
        Laptop laptop14 = new Laptop(14,"Apple", "Pro", 63000.00, 16, 12, "M1",
                "Mac");
        Laptop laptop15 = new Laptop(15, "Lenovo", "A54", 100000.00, 8, 16, "AMD",
                "Linux");

        List<Laptop> list_of_laptop = new ArrayList<>();
        list_of_laptop.add(laptop1);
        list_of_laptop.add(laptop2);
        list_of_laptop.add(laptop3);
        list_of_laptop.add(laptop4);
        list_of_laptop.add(laptop5);
        list_of_laptop.add(laptop6);
        list_of_laptop.add(laptop7);
        list_of_laptop.add(laptop8);
        list_of_laptop.add(laptop9);
        list_of_laptop.add(laptop10);
        list_of_laptop.add(laptop11);
        list_of_laptop.add(laptop12);
        list_of_laptop.add(laptop13);
        list_of_laptop.add(laptop14);
        list_of_laptop.add(laptop15);

        Map<Integer, String> map_categories = new HashMap<>();
        map_categories.put(1, "Размер оперативной памяти");
        map_categories.put(2, "Стоимость");
        map_categories.put(3, "Брэнд");
        map_categories.put(4, "Количество ядер процессора");
        map_categories.put(5, "Процессор");



        ComparatorCost comparatorCost = new ComparatorCost();
        Collections.sort(list_of_laptop, comparatorCost); // сортировка по стоимости
        System.out.println(list_of_laptop);

        ComparatorRAM comparatorRAM = new ComparatorRAM();
        Collections.sort(list_of_laptop, comparatorRAM); // сортировка по оперативной памяти
        System.out.println(list_of_laptop);

        ComparatorNumberOfCores comparatorNumberOfCost = new ComparatorNumberOfCores();
        Collections.sort(list_of_laptop, comparatorNumberOfCost); // сортировка по ядрам
        System.out.println(list_of_laptop);


        while (true) {
            System.out.println("Введите цифру, соответствующую цели фильтрации ноутбука: \n" +
                    "1 - Размер оперативной памяти \n" +
                    "2 - Стоимость \n" +
                    "3 - Брэнд \n" +
                    "4 - Количество ядер процессора \n" +
                    "5 - Процессор \n" +
                    "6 - Зарегистрироваться в системе лояльности и получить скидку \n" +
                    "0 - Выход из программы"
            );
            Scanner scanner = new Scanner(System.in);
            int kr = scanner.nextInt();
            switch (kr) {
                case 0:
                    break;
                case 1:
                    System.out.println("Выбранный Вами критерий: " + map_categories.get(1));
                    System.out.println("Введите размер оперативной памяти, который Вам нужен: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int ram = scanner1.nextInt();
                    for (Laptop i : list_of_laptop) {
                        if (i.getRam() == ram) {
                            // i.turn_on_the_laptop(); // включение ноутбука по желанию пользователя
                            System.out.println(i);
                            //i.turn_off_the_laptop(); // выключение ноутбука по желанию пользователя
                        }
                    }
                    break;
                case 2:
                    System.out.println("Выбранный Вами критерий: " + map_categories.get(2));
                    System.out.println("Введите верхний порог стоимости: ");
                    Scanner scanner2 = new Scanner(System.in);
                    double cost = scanner2.nextDouble();
                    for (Laptop i : list_of_laptop) {
                        if (i.getCost() <= cost) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 3:
                    int f = 0;
                    System.out.println("Выбранный Вами критерий: " + map_categories.get(3));
                    System.out.println("Введите брэнд, который Вам нужен: ");
                    Scanner scanner3 = new Scanner(System.in);
                    String brand = scanner3.nextLine();
                    for (Laptop i : list_of_laptop) {
                        if (i.getBrand().equalsIgnoreCase(brand)) {
                            System.out.println(i);
                            f = 1;
                        }
                    }
                    if (f == 0){
                        System.out.println("Ведённый Вами брэнд отсутствует в нашем каталоге");
                    }
                    break;
                case 4:
                    System.out.println("Выбранный Вами критерий: " + map_categories.get(4));
                    System.out.println("Введите минимальное количество ядер процессора, которое Вам нужно: ");
                    Scanner scanner4 = new Scanner(System.in);
                    int cpu_i = scanner4.nextInt();
                    for (Laptop i : list_of_laptop) {
                        if (i.getNumber_of_cores() >= cpu_i) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 5:
                    int f_1 = 0;
                    System.out.println("Выбранный Вами критерий: " + map_categories.get(5));
                    System.out.println("Введите процессор, который Вам нужен: ");
                    Scanner scanner5 = new Scanner(System.in);
                    String cpu = scanner5.nextLine();
                    for (Laptop i : list_of_laptop) {
                        if (i.getCpu().equalsIgnoreCase(cpu)) {
                            System.out.println(i);
                            f_1 = 1;
                        }
                    }
                    if (f_1 == 0) {
                        System.out.println("Ноутбук с введённым Вами процессором отсутствует в нашем каталоге");
                    }
                    break;
                case 6:
                    System.out.println("Для того чтобы зарегистрироваться в нашей системе лояльности" +
                            "Вам необходимо, внести свои данные: ");
                    System.out.println("Введите ФИО: ");
                    Scanner scanner46 = new Scanner(System.in);
                    String str1 = scanner46.nextLine();
                    System.out.println("Введите Ваш возраст: ");
                    Scanner scanner56 = new Scanner(System.in);
                    int k2 = scanner56.nextInt();
                    if (k2 >= 18) {
                        System.out.println("Введите Вашу электронную почту, чтобы первыми узнавать о поступлении новых моделей:");
                        Scanner scanner66 = new Scanner(System.in);
                        String str2 = scanner66.nextLine();
                        System.out.println("Ваша регистрация прошла успешно!" +
                                "Ваша карта лояльности: \n" +
                                "Фамилия Имя Отчество: " + str1 + "\n" +
                                "Возраст: " + k2 + "\n" +
                                "Электронная почта: " + str2 + "\n" +
                                "Добро пожаловать в нашу систему лояльности \n" +
                                "Теперь мы можем предоставить Вам скидку на ноутбук, при условии, что его стоимость не меньше 75000 \n" +
                                "Введите id нужного ноутбука: ");
                        Scanner scanner76 = new Scanner(System.in);
                        int k3 = scanner76.nextInt();
                        for (Laptop i : list_of_laptop) {
                            if (i.getId() == k3) {
                                int v = i.get_a_discount(k3);
                                System.out.println("ID выбранного Вами компьютера: " + v + "\n");
                                if (i.getCost() >= 75000) {
                                    System.out.println("Мы сделали Вам скидку 15%");
                                    double new_c = i.getCost() - i.getCost() * 0.15;
                                    System.out.println("Новая стоимость ноутбука с учётом скидки: " + new_c);
                                } else {
                                    System.out.println("Стоимость данного ноутбука менее 75000, поэтому скидки на него нет \n");
                                }
                            }
                        }

                    } else {
                        System.out.println("К сожалению, регистрация в системе лояльности доступна только совершеннолетним");
                    }
                }
            }
        }

    }


