package HomeWork;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNamePhone("Peters", 456985, phoneBook);
        addNamePhone("Gibson", 658789, phoneBook);
        addNamePhone("Grant", 457878, phoneBook);
        addNamePhone("Peters", 899988877, phoneBook);
        addNamePhone("Davis", 894589, phoneBook);
        printPhoneBook(phoneBook);
    }

    private static void printPhoneBook(Map<String, ArrayList<Integer>> map) {
        System.out.println("Телефонный справочник: ");
        for (var item : map.entrySet()) {
            String phone = "";
            for (int i : item.getValue()) {
                phone = phone + i + ", ";
            }
            System.out.printf("%s: %s \n", "Фамилия: " + item.getKey(), "Телефон: " + phone);
        }
    }

    private static void addNamePhone(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(value);
            map.put(key, arrayList);
        }
    }
}
