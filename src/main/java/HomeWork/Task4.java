package HomeWork;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
         task1();
         task2();
       task3();
    }

    //Создать список типа ArrayList<String>.
    //Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
    private static String task3() {
        String str = "Hi 6 8 Black Rad";
        String description = Pattern.compile("\\d").matcher(str).replaceAll("");

        System.out.println(description);
        return str;
    }

    //Задан целочисленный список ArrayList.
    //Найти минимальное, максимальное и среднее арифметическое из этого списка.
    private static void task2() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1, 10);
            list.add(number);
        }
        System.out.println("Список" + "\t->\t" + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(value -> value).average().getAsDouble();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое число: " + average);
    }

    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    // (в языке уже есть что-то готовое для этого)
    private static void task1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(5);
        list.add(17);
        list.add(32);
        list.add(2);
        list.add(9);

        System.out.println("Список" + "\t->\t" + list);

        list.removeIf(n -> n % 2 == 0);

        System.out.println("Список, в котором удалены четные числа" + "\t->\t" + list);
    }
}
