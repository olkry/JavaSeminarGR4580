import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;

public class Task4 {
    // Напишите метод, который составит строку, состоящую из 100
    // повторений слова TEST и метод, который запишет эту строку в
    // простой текстовый файл, обработайте исключения.

    // public static void writeStringToFile(int num) throws IOException {
    //     try (PrintWriter pw = new PrintWriter(new FileWriter("task4Output.txt"))){
    //         pw.println(generateString("TEST", num));
    //     }
    // }

    // public static String generateString(String word, int repeatCount) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < repeatCount; i++) {
    //         sb.append(word);
    //     }
    //     return sb.toString();
    // }

//Another solution

    public static String creaString(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("Test");
        }
        return sb.toString();
    }

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
