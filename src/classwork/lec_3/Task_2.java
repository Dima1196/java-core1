package classwork.lec_3;

public class Task_2 {
    public static void main(String[] args) {
       int [] arr = new int[5];

       for ( int i = 0; i < arr.length; i++){
        arr[i]=i+1;
       }
       for (int i = 0; i < arr.length; i++){
           int elem= arr[i];
           System.out.println(elem);
       }
    }

}
