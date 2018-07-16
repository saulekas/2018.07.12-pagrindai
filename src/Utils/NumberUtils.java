package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {

    public static double getCorrectNumber(Scanner sc, String message) {
        double result;

        while (true) {

            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nepavyko pakartot");
                sc.nextLine();
            }


        }
        return result;

    }
}
