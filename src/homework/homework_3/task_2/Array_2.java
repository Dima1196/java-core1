package homework.homework_3.task_2;

import java.util.Arrays;
import java.util.Collections;

public class Array_2 {
 public static void main(String[] args) {
    Integer[] name = new Integer[50];
    int i = 0;
    int b = 1;
    while (i < 50) {
        name [i] = b;
        b += 2;
        i++;
    }
    for (i = 0; i < name .length; i++) {
        System.out.print(name [i] + " ");
    }
    System.out.print("\n Sorted: \n");
    Arrays.sort(name , Collections.reverseOrder());
    for (i = 0; i < name.length; i++) {
        System.out.print(name [i] + " ");
    }
}
}
