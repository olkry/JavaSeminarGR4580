import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioFormat.Encoding;

public class App {
    public static void main(String[] args) throws Exception {

        // task1();
        // task1Plus();
        // task2();
        // task3();
        // task3Else(); // Код не работает при последовательностях val! Пример с данным
        // массивом.
        // task4();
        // task5();
        // task6();
        // task8();

    }

    public static void task1() {
        // Задание №1
        // Написать программу, которая запросит пользователя ввести
        // <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение
        // “Привет, <Имя>!”
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = iScanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void task1Plus() {
        // В консоли запросить имя пользователя. В зависимости от
        // текущего времени, вывести приветствие вида
        // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        LocalTime timeOfDay = LocalTime.now();
        System.out.println("Time: " + timeOfDay);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = iScanner.nextLine();
        if (timeOfDay.getHour() >= 18 && timeOfDay.getHour() < 23) {
            System.out.println("Добрый вечер, " + name);
        }
        if (timeOfDay.getHour() >= 5 && timeOfDay.getHour() < 12) {
            System.out.println("Доброе утро, " + name);
        }
        if (timeOfDay.getHour() >= 12 && timeOfDay.getHour() < 18) {
            System.out.println("Добрый день, " + name);
        }
        if (timeOfDay.getHour() >= 23 && timeOfDay.getHour() < 5) {
            System.out.println("Доброй ночи, " + name);
        }
    }

    public static void task2() {
        // Задание №2
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        int[] mass = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                count += 1;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }

    public static void task3() {
        // Задание №3
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести
        // эти элементы в конец массива.
        // Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны от заданного, а остальные - равны ему.

        int[] arr = { 1, 3, 1, 0, 3, 1, 2, 0, 3, 1, 2, 0, 1, 2, 3 };
        int val = 3;
        int[] mass = new int[arr.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 3) {
                mass[index] = arr[i];
                index++;
            } else {
                count++;
            }
        }
        for (int i = arr.length - count; i < mass.length; i++) {
            mass[i] = val;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ",");
        }

    }

    public static void task3Else() {
        int[] arr = { 1, 3, 3, 1, 0, 3, 1, 2, 0, 3, 3, 1, 2, 0, 1, 2, 3 };
        int val = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = val;
            }
        }
        for (int item : arr) {
            System.out.printf("%d, ", item);
        }
    } // Код не работает при последовательностях val! Пример с данным массивом.

    public static void task4() {
        // Задание №4
        // Напишите метод, который находит самую длинную строку общего
        // префикса среди массива строк.
        // Если общего префикса нет, вернуть пустую строку ""

        String[] lines = { "dom", "domovoi", "domashniy" };
        System.out.println(findePfx(lines));
        System.out.println(lines[0].substring(0, findePfx(lines)));

    }

    private static int findePfx(String[] lines) {
        int res = 0;
        boolean pfxExis = true;
        while (pfxExis) {
            res++;
            for (int i = 0; i < lines.length - 1; i++) {
                if (res <= lines[i].length() && res <= lines[i + 1].length()) {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                        res--;
                        pfxExis = false;
                        break;
                    }
                } else {
                    res--;
                    pfxExis = false;
                    break;
                }

            }
        }
        return res;

    }

    public static void task5() {
        // Задание №5 (доп)
        // Во фразе "Welcome to the Java course" переставить слова
        // в обратном порядке.

        String soursLine = "Welcome to the Java course";
        String[] splitLine = soursLine.split(" ");
        String outLine = "";
        for (int i = splitLine.length - 1; i >= 0; i--) {
            outLine = outLine + splitLine[i] + " ";
        }
        System.out.println(soursLine);
        System.out.println(outLine);

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

    public static void task8() {
        // Задание №8 (доп)
        // Задан массив, например, nums = [1,7,3,6,5,6].
        // Написать программу, которая найдет индекс i для этого массива
        // такой, что сумма элементов с индексами < i равна сумме
        // элементов с индексами > i.

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(midleIndex(nums));
    }

    private static int loweSum(int[] arr, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int higeSum(int[] arr, int index) {
        int sum = 0;
        for (int i = arr.length - 1; i > index; i--) {
            sum += arr[i];
        }
        return sum;
    }

    private static int midleIndex(int[] num) {
        int index = 1;
        while (loweSum(num, index) < higeSum(num, index)) {
            index++;
        }
        if (loweSum(num, index) == higeSum(num, index)) {
            return index;
        } 
        else {
            return -1;
        }
    }

}