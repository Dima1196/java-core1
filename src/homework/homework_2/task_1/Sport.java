package homework.homework_2.task_1;

public class Sport {
    public static void main(String [] args){
        float dayFirst=10;
        float distanceSum=10;
        for(int i=1; i<7;i++){
            dayFirst*=1.1;
            distanceSum+=dayFirst;
        }
        System.out.println("7 day= "+distanceSum);
    }


}
