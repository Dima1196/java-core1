package homework.homework_2.task_3;

public class Addition {
    public static void main(String[]args){
        int numFirst=1;
        int sumRes=0;
        int sumResultAddition=0;
        for (int i=0;i<=7;i++){
            // поменяй местами, тогда не нужно будет sumResultAddition=sumRes+1; делать
            numFirst*=2;
            sumRes+=numFirst;
        }
        sumResultAddition=sumRes+1;
        System.out.println("sum of all numbers="+sumResultAddition);
    }
}
