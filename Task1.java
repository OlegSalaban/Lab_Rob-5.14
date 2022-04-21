import java.util.Scanner;

public class Task1 {
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

        String result = word1.concat(" ").concat(word2)
                .concat(" ").concat(word3)
                .concat(" ").concat(word4)
                .concat(" ").concat(word5);

        System.out.println("Result: " + result);

    }
}
