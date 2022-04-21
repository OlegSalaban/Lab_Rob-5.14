import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1 > ");
        String word1 = scanner.next();

        System.out.print("Word 2 > ");
        String word2 = scanner.next();

        System.out.print("Word 3 > ");
        String word3 = scanner.next();

        System.out.print("Word 4 > ");
        String word4 = scanner.next();

        System.out.print("Word 5 > ");
        String word5 = scanner.next();

        System.out.println("First letters: " + word1.substring(0, 1) + ", " +
            word2.substring(0, 1) + ", " +
            word3.substring(0, 1) + ", " +
            word4.substring(0, 1) + ", " +
            word5.substring(0, 1) + ".");
    }
}
