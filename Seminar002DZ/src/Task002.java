import java.io.FileWriter;
import java.io.IOException;

public class Task002 {
      // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
      // каждой итерации запишите в лог-файл.
      public static void bubbleSort(int[] numbersArrey, FileWriter logfile) throws IOException {
            boolean swapped;
            for (int i = 0; i < numbersArrey.length - 1; i++) {
                  swapped = false;
                  for (int j = 0; j < numbersArrey.length - i - 1; j++) {
                        if (numbersArrey[j + 1] < numbersArrey[j]) {
                              int swap = numbersArrey[j];
                              numbersArrey[j] = numbersArrey[j + 1];
                              numbersArrey[j + 1] = swap;

                              swapped = true;
                        }
                  }
                  logfile.write("Iteration " + (i + 1) + ": ");
                  for (int num: numbersArrey) {
                        logfile.write(num + " ");
                  }
                  logfile.write("\n");

                  if (swapped != true) {
                        break;
                  }
            }


            for (int i = 0; i < numbersArrey.length; i++) {
                  System.out.print(numbersArrey[i] + " ");
            }
      }

}
