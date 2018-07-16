import Utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecondTask secondTask = new SecondTask();


        System.out.println("Pasirinkite figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");
        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                System.out.println(secondTask.trikampioPlotas(scanner));
                break;
            case "b":
                System.out.println(secondTask.staciakampioPlotas(scanner));
                break;
            case "c":
                System.out.println(secondTask.kvadratoPlotas(scanner));
                break;
            case "d":
                System.out.println(secondTask.apskritimoPlotas(scanner));
                break;
            default:
                System.out.println("Ka tu nematai, kas pateikta ");
                break;
        }
    }

    private double trikampioPlotas(Scanner scanner) {

        double a = NumberUtils.getCorrectNumber(scanner, "Iveskite a statini");
        double b = NumberUtils.getCorrectNumber(scanner, "Iveskitre b statini");

        return (a * b) / 2;


    }

    private double staciakampioPlotas(Scanner scanner) {

        double a = NumberUtils.getCorrectNumber(scanner, "iveskite a statini");
        double b = NumberUtils.getCorrectNumber(scanner, "iveskite b statini");
        return (a * b);
    }

    private double kvadratoPlotas(Scanner scanner) {

        double a = NumberUtils.getCorrectNumber(scanner, "Iveskite a statini");
        return Math.pow(a, 2);
    }
    private double apskritimoPlotas(Scanner scanner){

        double a = NumberUtils.getCorrectNumber(scanner, "Iveskite spinduli");
        return Math.PI*Math.pow(a,2);
    }


}
