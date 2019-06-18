package homework.homework_3.task_1;

public class Array {
    public static void main(String[] args) {
        int[] name;
        name = new int[12];
        int i = 0;
        int b = 4;
        while (i < 12){ name [i] = b; b += 4; i++;
        }
        for (i = 0 ; i < 12;i++){
            System.out.print(name[i]+ " ");
        }
        System.out.println("\n");
        for (i=0;i<12; i++){
            System.out.println(name [i]);
        }
    }
}
