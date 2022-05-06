package Example4;
/*Продемонстрировать применение блок кода.
  Присвоить исходному файлу имя "BlockTest.java"
 */

public class BlockTest {
    public static void main(String[] args){
//        int x, y;
//        y = 20;
//        // адресатом этого оператора цикла служит блок кода
//        for (x = 0; x<10; x++){
//            System.out.println("Значение х: " + x);
//            System.out.println("Значение y: " + y);
//            --y;
//        }
//
            test();
    }

    private static void test() {
        short s = Short.MAX_VALUE;
        System.out.println("max short = " + s);
        int i = s + 10;

        System.out.println("max short + 10 = " + i);
        i = s;
        System.out.println("i = " + i);

        if (i < 32767 - 10)
            s = (short)(i + 10);
        else
            System.out.println("Ошибка преобразования типа ште в short");
        System.out.println("s = " + s);
    }
}
