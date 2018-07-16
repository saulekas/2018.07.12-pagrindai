import Utils.NumberUtils;

import java.util.Scanner;

public class FithTask {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double sanaudos = NumberUtils.getCorrectNumber(scanner, "Iveskite kuro sanaudas");
        double nuvaziuotaKm = NumberUtils.getCorrectNumber(scanner, "Iveskite kiek nuvaziavote km");

        double result =  (sanaudos*100)/nuvaziuotaKm;
        System.out.println("Jusu vidurkis yra:"+ result);

    }
}
