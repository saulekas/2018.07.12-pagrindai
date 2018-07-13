import java.util.Scanner;

public class Uzdavinys1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Ïveskite zodi");
        String word = scanner.nextLine();

        System.out.println(word);*/
        getCorrectWord(scanner);
    }

    private static void getCorrectWord(Scanner sc) {
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = sc.nextLine().toLowerCase();
            //TODO CIA
        } while (word.equals("Pabaiga"));


    }

    private static void printwORD(String word) {
        if (word.length() % 2 == 0) {
            System.out.println("Ivestas zodis" + word + " lyginis, jo ilgois yra " + word.length());

        } else {
            System.out.println("Ivestas zodis " + word + " nelyginis, jo ilgis yra " + word.length());

        }
    }
    private static int countLetters(String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            if (letter == temp) {
                result++;
            }
            /*daromas pataisymas ir testuojama kaip matosi

        }
        return result;

    }


}
