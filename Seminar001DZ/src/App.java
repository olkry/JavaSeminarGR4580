import java.util.Scanner;

import javafx.scene.shape.Line;

public class App {
    public static void main(String[] args) throws Exception {
        // task001();
        // task002();
        // task003();
        // task004();  //Не осилил, понимаю, что оно похоже на 8ю задачу, но не могу понять как применить....
        // task006Sem();  //Задача №6  из семинара  

    }

    public static void task001() {
        // Вычислить сумма чисел от 1 до n
        Scanner numScan = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int num = numScan.nextInt();
        numScan.close();
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println(total);
    }

    public static void task002() {
        // Вывести все простые числа от 1 до 1000
        System.out.println("1");
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    public static void task003() {
        // Реализовать простой калькулятор
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /)only!): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        System.out.println(calculator(num1, num2, operator));
    }

    private static double calculator(double num1, Double num2, char operator) {
        double total = 0;
        if (operator == '+') {
            total = num1+num2;
        }
        if (operator == '-') {
            total=num1-num2;
        }
        if (operator == '/') {
            total=num1/num2;
        }
        if (operator == '*') {
            total = num1*num2;
        }

        return total;
    }

    public static void task006Sem() {
        // Задание №6 (доп)
        // Реализовать функцию возведения числа а в степень b. a, b из Z.
        // Сводя количество выполняемых действий к минимуму.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        System.out.println(Math.pow(num1, num2));
    }



}
