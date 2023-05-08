package kendiCalısmalarım;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
    int rows = scanner.nextInt();
        System.out.println("Pascal's triangle:");

    // Pascal's triangle calculation and printing
        for (int i = 0; i < rows; i++) {
        int number = 1;
        System.out.printf("%" + (rows - i) * 2 + "s", ""); // for formatting
        for (int j = 0; j <= i; j++) {
            System.out.printf("%4d", number);
            number = number * (i - j) / (j + 1);
        }
        System.out.println();
    }
}
}
