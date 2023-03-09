package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         команда sout
//           System.out.println("Hello, world!");
//        arrMax();
//        test();
//        inputNameAndPrintHi();
    }

    private static void arrMax() {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1};
        int count = 0;
        int temp = 0;

//        for (int i = 0; i < arr.length; i++) {
        for (int num : arr) {
            if (num == 1) {
                temp++;
                if (count < temp) {
                    count = temp;
                }
            } else {
                temp = 0;
            }
        }
        System.out.println(count);
    }


    private static void test() {
        System.out.println("Apple");
        System.out.print("Apple");
        System.out.println();
        System.out.printf("%3d -- %.2f --%s%n", 5, 5.4545, "Hello");
    }

    private static void inputNameAndPrintHi() {
        //lowerCamelCase
        //UpperCamelCase
        Scanner in = new Scanner(System.in);
        System.out.printf("name: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }
}







