package stringutils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int userInput = scanner.nextInt();

        String result = valueforplusnadminus(userInput);
        System.out.println(result);
    }

    public static String valueforplusnadminus(int n) {
        if (n <= 0) {
            return "Opps. You entered negative value. Pls enter positive number.";
        }

        StringBuilder pattern = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pattern.append("+");
            } else {
                pattern.append("-");
            }
        }

        return pattern.toString();
    }
}
