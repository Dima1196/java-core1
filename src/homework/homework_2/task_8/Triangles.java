package homework.homework_2.task_8;

public class Triangles {
    public static void main(String[] args) {
        // er? сокращать можно, но если это что-то известное, а так непонятно
        int er = 0;
        String rt = "";
        String fr = "";
        for (er = 0; er < 5; er++) {
            String a = "*";
            rt = a + fr;
            fr = rt;
            System.out.println(fr);
        }
    }
}
