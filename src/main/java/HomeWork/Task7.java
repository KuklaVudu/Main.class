package HomeWork;

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        String[] worker = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Андрей Петров", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        ArrayList<String> workerName = getName(worker);
        Map<String, Integer> mapName = getMap(workerName);
        System.out.println("Повторяющиеся имена: ");
        iterationName(mapName);
        System.out.println("Сортировка имен по убыванию популярности: ");
        sortNameWorker(mapName);
    }

    public static ArrayList<String> getName(String[] list) {
        ArrayList<String> name = new ArrayList<>();
        for (String element : list) {
            String[] elementList = element.split(" ");
            name.add(elementList[0]);
        }
        return name;
    }

    public static Map<String, Integer> getMap(ArrayList<String> name) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j)))
                    count += 1;
            }
            if (!mapName.containsKey(name.get(i)))
                mapName.put(name.get(i), count);
        }
        return mapName;
    }

    public static void iterationName(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    public static void sortNameWorker(Map<String, Integer> map) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (!arrayList.contains(item.getValue()))
                arrayList.add(item.getValue());
        }
        arrayList.sort(null);
        for (int i = arrayList.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if (arrayList.get(i) == item.getValue())
                    System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }
}