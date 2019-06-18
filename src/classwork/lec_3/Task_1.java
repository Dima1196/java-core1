package classwork.lec_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение  ячейки  номер" + (i + 1));
            int number = input.nextInt();
            arr[i] = number;
            sum += number;
        }
        System.out.println(arr.toString());
        System.out.println("Sum=" + sum);

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentElem = arr[i];

            if (min > currentElem) {
                min = currentElem;
            }
            if (max < currentElem) {
                max = currentElem;
            }
            System.out.println("max=" + max);
            System.out.println("min=" + min);
        }
    }
}