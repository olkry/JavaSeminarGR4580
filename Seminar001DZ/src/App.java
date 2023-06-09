import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task001();
        task002();

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

}
