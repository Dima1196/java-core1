package homework.homework_2.task_2;

public class Segmentation {
    public static void main(String[]args){
        int startingAmeba=1;
        int time=0;
        int sumSigmentationcell=0;
        // i +=3 - сразу цикл на каждый 3ч
        for( int i=0; i<8; i++){
            // i количество делений
            time+=3;
            startingAmeba*=2;
            System.out.println("Через промежуток времение"+ time+ "Количество амеб после каждого деления"+ startingAmeba);
        }
    }
}
