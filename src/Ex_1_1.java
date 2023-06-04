public class Ex_1_1 {

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
}
