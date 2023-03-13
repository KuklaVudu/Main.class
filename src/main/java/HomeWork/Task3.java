package HomeWork;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        StringTask();
        writeException();
    }

    private static void writeException() {
        try {
            FileOutputStream fs = new FileOutputStream("test.txt", true);
            fs.write(StringTask().toString().getBytes());
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    private static StringBuilder StringTask() {
        StringBuilder sb = new StringBuilder(101);
        for (int i = 0; i < 101; i++) {
            sb.append(i).append(": ").append("TEST ").append(System.lineSeparator());
            System.out.println(sb);
        }
        return sb;
    }
}


