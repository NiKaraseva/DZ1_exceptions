import java.util.*;

public class Main {
    public static void main(String[] args) {

//      №1.1
//        System.out.println("Результат выражения: " + calc());


//      №1.2
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
//        System.out.println("Среднее арифметическое элементов массива: " + average(array, maxS));


//      №1.3
//        // System.out.println(checkIzo("pub", "food")); – проверка исключения
//        System.out.println(checkIzo("paper", "title"));
//        System.out.println(checkIzo("foo", "sun"));


//      №2

//        int[][] array1 = new int[][]{{5, 7},{9, 1}, {13, 0}}; // – проверка исключения
        int[][] array1 = new int[][]{{5, 7},{9, 1}};
        int[][] array2 = new int[][]{{3, 1},{5, 9}};
        int[][] newArray = subArray(array1, array2);
        for (int[] aSub : newArray) {
            System.out.printf(Arrays.toString(aSub));
        }

    }


    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    /* 1.1 Метод принимает массив, заполненный рандомными числами. Если среднее арифметическое всех элементов массива
    больше заданного числа maxSize – уведомляем об этом пользователя, если меньше – возвращаем среднее арифметическое. */

    public static double average(int[] arr, int maxSize){
        double aver;
        double sum = 0;
        for (int m : arr) {
            sum += m;
        }
        aver = sum/ arr.length;
        if(aver > maxSize){
            throw new RuntimeException("Среднее арифметическое больше заданного числа maxSize");
        }
        return aver;
    }


    // 1.2 Метод который принимает 2 строки и проверяет, являются ли они изоморфными.
    public static boolean checkIzo(String s1, String s2){

        if (s1.length() != s2.length()){
            throw new RuntimeException("Строки разной длины, введите строки одинаковой длины");
        }
        Map<Character, Character> map = new HashMap<>(); {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            for (int i = 0; i < c1.length; i++) {
                if (map.containsKey(c1[i])){
                    if (c2[i] != map.get(c1[i])) {
                        return false;
                    }
                }
                else {
                    map.put(c1[i], c2[i]);
                }
            }
        }
        return true;
    }



    // 1.3 Простенький калькулятор на Java
    public static int calc() {
        System.out.println("Введите первое число a: ");
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        System.out.println("Введите операцию: ");
        String operation = scanner.next();
        System.out.println("Введите второе число b: ");
        Integer b = scanner.nextInt();
        if (Objects.equals(operation, "+")) {
            return a + b;
        } else if (Objects.equals(operation, "-")) {
            return a - b;
        } else if (Objects.equals(operation, "*")) {
            return a * b;
        } else if (Objects.equals(operation, "/")) {
            if (b != 0) {
                return a / b;
            } else {
                throw new RuntimeException("Ошибка: на 0 делить нельзя!");
            }
        } else {
            throw new RuntimeException("Ошибка. Необходимо ввести одну из следующих операций: +, -, *, /");
        }
    }


    /* 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
     */
    public static int[][] subArray(int[][] arr1, int[][] arr2){
        int[][] newArr = new int[arr1.length][arr2.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны!");
            }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                newArr[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return newArr;
    }

}