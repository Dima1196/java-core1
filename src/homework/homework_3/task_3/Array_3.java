package homework.homework_3.task_3;

public class Array_3 {public static void main(String[] args) {
    int[] name = new int[15];
    for (int i = 0; i < name.length; i++) {
        name [i] = (int) (Math.random() * 99);
        System.out.print(name [i] + "  ");
    }
    System.out.println();
    int n = 0;
    int sum = 0;
    for (int x = 0; x < name .length; x++) {
        if (name [x] % 2 == 1) {
            n++;
            sum += name [x];
        }
    }
    System.out.println("Total odd numbers = " + n);
    System.out.println("The sum of odd elements = " + sum);
}
}

