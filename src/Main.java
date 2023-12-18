import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите 5 слов для первого списка:");
            String wordA = scanner.nextLine();
            A.add(wordA);
        }
        System.out.println(A);
        System.out.println("--------------------------------------------------");

        for (int t = 0; t < 5; t++) {
            System.out.println("Введите 5 слов для второго списка:");
            String wordB = scanner.nextLine();
            B.add(wordB);
        }
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        System.out.println("--------------------------------------------------");
        ArrayList<String> C = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(4-i));
        }

        System.out.println("Объединенный список C: " + C);
        Collections.sort(C, Comparator.comparingInt(String ::length));
        System.out.println("Отсартированный список" +C);
    }
}
