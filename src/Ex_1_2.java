import java.util.Objects;
import java.util.Scanner;

public class Ex_1_2 {

    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    // 1.2 Простенький калькулятор на Java
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
}
