//This program will ask to user to enter a number and the program will show the negative numbers
package src;

import java.util.Locale;
import java.util.Scanner;
public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers?");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input a Number ?: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }

}
