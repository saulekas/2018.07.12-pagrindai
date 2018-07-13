
public class FirstTask {
    public static void main(String[] args) {
        String palindrome= "KOL EINU ŠUNIE LOK".replaceAll(" ", "");


if (isPaslindrome(palindrome)){
   System.out.println("Polindomas");


} else {
    System.out.println("Nepolindromas");

}


    }

    private static boolean isPaslindrome (String palindrome) {
        boolean result = true;
        for ( int i = 0; i < palindrome.length(); i++){
            char a = palindrome.charAt(i);
            char b = palindrome.charAt(palindrome.length() - i - 1);
            if (a !=b){
               result = false;
               break;
            }
        }

        return result;
    }
}
