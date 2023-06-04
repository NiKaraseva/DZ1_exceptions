import java.util.*;

public class Main {
    public static void main(String[] args) {


//      № Вызов Ex_1_1
//        int[] array = new int[10];
//
//        for (int i=0; i<array.length; i++)
//            array[i] = (int) (Math.random() * 100);
//        System.out.println("Рандомный массив: ");
//        for (int i: array)
//            System.out.print(i + " " );
//
//        System.out.println();
//        // int maxS = 40; // – проверка исключения
//        int maxS = 100;
//        System.out.println("Среднее арифметическое элементов массива: " + Ex_1_1.average(array, maxS));


//      № Вызов Ex_1_2
//        System.out.println("Результат выражения: " + Ex_1_2.calc());


//      № Вызов Ex_1_3
//        // System.out.println(Ex_1_3.checkIzo("pub", "food")); // – проверка исключения
//        System.out.println(Ex_1_3.checkIzo("paper", "title"));
//        System.out.println(Ex_1_3.checkIzo("foo", "sun"));


//      №2

        // int[][] array1 = new int[][]{{5, 7},{9, 1}, {13, 0}}; // – проверка исключения
        int[][] array1 = new int[][]{{5, 7},{9, 1}};
        int[][] array2 = new int[][]{{3, 1},{5, 9}};
        int[][] newArray = Ex_2.subArray(array1, array2);
        for (int[] aSub : newArray) {
            System.out.printf(Arrays.toString(aSub));
        }

    }

}