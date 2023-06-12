import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // // Task1
        // String task1String = "name:Ivanov, country:Russia, city:Moscow, age:null";
        // System.out.println(task1String);
        // String[] abat = Task001.stringParsing(task1String);
        // String finalli = Task001.stringCompelator(abat);
        // System.out.println(finalli);

        // Task2
        int[] numArrey = { 9, 4, 6, 1, 7, 3, 9, 0, 6, 12, 5, 4, 6, 2, 9 };
        try {
            FileWriter logFile = new FileWriter("log.txt");
            Task002.bubbleSort(numArrey, logFile);

            logFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
