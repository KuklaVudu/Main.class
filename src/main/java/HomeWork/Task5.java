package HomeWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task5 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            if (str.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (str.equalsIgnoreCase("print")) {
                Iterator<String> itr = wordsList.iterator();

                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
            } else if (str.equalsIgnoreCase("revert")) {
                wordsList.pop();
            } else {
                wordsList.push(str);
            }
        }
    }
}