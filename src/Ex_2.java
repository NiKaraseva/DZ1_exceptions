public class Ex_2 {

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
