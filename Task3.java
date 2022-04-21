import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0, b = 0, c = 0;
        boolean isCorrect = false;

        do{
            try {
                System.out.print("Input first value > ");
                String value = scanner.nextLine();

                a = Double.parseDouble(value);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Try again!\n");
            }
        }while (!isCorrect);

        double max = a;

        isCorrect = false;
        do{
            try {
                System.out.print("Input second value > ");
                String value = scanner.nextLine();

                b = Double.parseDouble(value);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Try again!\n");
            }
        }while (!isCorrect);

        if(max < b)
            max = b;

        isCorrect = false;
        do{
            try {
                System.out.print("Input third value > ");
                String value = scanner.nextLine();

                c = Double.parseDouble(value);
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Try again!\n");
            }
        }while (!isCorrect);

        if(max < c)
            max = c;

        System.out.println("Max: " + max);
    }
}
