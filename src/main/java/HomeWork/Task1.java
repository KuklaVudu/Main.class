package HomeWork;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//         команда sout
//           System.out.println("Hello, world!");
        arrElement();
        arrMaxMin();
    }

    private static void arrElement() {
        // Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному,
        // нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов
        // массива должны быть отличны от заданного, а остальные - равны ему.
        int[] nums = {3, 2, 2, 3};
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3) {
                if (i != val) {
                    int temp = nums[val];
                    nums[val] = nums[i];
                    nums[i] = temp;
                }
                val++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void arrMaxMin() { // Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(21);
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}