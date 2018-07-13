public class WelkomClass {


    public static void main(String[] arga) {
        int a = 10;
        System.out.print(a);
        //kaip iskviestiti statini metoda?
        int b = minus(12, 6);
        System.out.println(b);
        //kaip iskviesti ne statini metoda?
        WelkomClass welcomeclass = new WelkomClass();
        welcomeclass.printname("Ändrius");


    }

    private void printname(String name) {
        System.out.print(name);
    }


    static int minus(int numb, int numb2) {
        return numb - numb2;
    }

    private static int countLetters(String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            if (letter == temp) {

            }
            return result;
        }

    }

}