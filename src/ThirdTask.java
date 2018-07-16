import Utils.NumberUtils;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ugis = NumberUtils.getCorrectNumber(scanner, "Iveskite savo ugi, prasau");
        double svoris = NumberUtils.getCorrectNumber(scanner, "Iveskite savo svori, prasau");

        double result = svoris/Math.pow(ugis, 2);
        System.out.println("jusu KMI yra:"+ result);

    }

    private static double getKMI(double ugis, double svoris){
        return svoris/Math.pow(ugis, 2);
    }
}
