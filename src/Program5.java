//this program

package src;

import java.util.Locale;
import java.util.Scanner;
import src.entities.Rent;
public class Program5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent r = new Rent ("Maiara", "maiara@gmail.com");

        System.out.println(r);

        sc.close();

    }
}
