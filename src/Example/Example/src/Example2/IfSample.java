package Example2;
/*
Продемонстрировать применение условного оператора If
Присвоить исходному файлу имя "IfSample.java"
 */

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if(x < y) System.out.println("x меньше y");
        x = x * 2;
       System.out.println("x теперь равно y");
        x = x * 2;
        if(x > y) System.out.println("х теперь больше у");
       //Этот оператор не будет ни чего выводить
        if (x==y) System.out.println("Вы не увидите этого");






    }
}
