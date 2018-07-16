import Utils.NumberUtils;

import java.util.Scanner;

public class SixtTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (!line.equals("q")) {
            System.out.println("Iveskite du skaicius ir veiksma tarp ju pvz '20 + 20");

            line = scanner.nextLine();
            //"20 + 12"
            String[] items = line.split(" ");
            if (items.length == 3) {


                double numb = getNumber(scanner, items[0], "Pakartokite pirmo sk ivedima");
                double numb2 = getNumber(scanner, items[2], "Pakartokite antro skaiciaus ivedima");

                Calculator calculator = new Calculator();

                double result;
                switch (items[1]) {
                    case "+":
                        while (numb2 == 0) {
                            numb2 = NumberUtils.getCorrectNumber(scanner, "Iveskite gera skaiciu ir nelygu 0");
                        }

                        result = calculator.sum(numb, numb2);
                        System.out.println("suma: " + result);
                        break;

                    case "-":

                        result = calculator.skirtumas(numb, numb2);
                        System.out.println("skirtumas: " + result);
                        break;

                    case "*":

                        result = calculator.daugyba(numb, numb2);
                        System.out.println("daugyba: " + result);
                        break;
                    case "/":

                        result = calculator.dalyba(numb, numb2);
                        System.out.println("dalyba: " + result);
                        break;
                    default:
                        System.out.println("Nepavyko rasti");
                        break;

                }
            }
        }
    }
    private static double getNumber (Scanner scanner, String numb, String messadge) {
        double result;
        try {
            result = Double.parseDouble(numb);

        }catch (NumberFormatException e){
           result = NumberUtils.getCorrectNumber(scanner, messadge);
        }


        return result;

    }
}
