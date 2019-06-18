package homework.homework_2.task_5;
// Это решешние было у кого-то. И оно с ошибкой. Окончания выводить было необязательно. 
// Замени 2.54 на 2.4 и получишь в самом конце "20 дюймoв = 48.0 сантиметра", т.е. неверное окончание
// Смотреть другие решение - норм, но надо разбираться и тем более проверять работу
public class Table {
    public static void main(String [] args){
        int inch=0;
        double inchValue=2.54;
        double firstValueTable=1;
        for (int i=1;i<=20;i++) {
            firstValueTable = i * inchValue;
            String ending;
            if (i % 10 == 1 && i % 100 != 11) {
                ending = "";
            } else if (i % 10 == 2 && i % 100 != 12 ||
                    i % 10 == 3 && i % 100 != 13 ||
                    i % 10 == 4 && i % 100 != 14) {
                ending = "a";
                // else {}
            } else ending = "oв";
            System.out.println(i+" дюйм"+ending + " = "+firstValueTable+" сантиметра");
        }
    }
}
