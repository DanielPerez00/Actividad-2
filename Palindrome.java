import java.util.Scanner;

public class Palindrome
{
  

    public static boolean isPalindrome(String word)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase o palabra sin espacios");
        word = sc.nextLine();

        boolean is_palindrome = false;

        StringBuilder string_builder = new StringBuilder(word);
        String reversed_word = string_builder.reverse().toString();

        is_palindrome = word.equals(reversed_word);

        return is_palindrome;

    }

    public static void main(String[] args) {

        String word = "palabra";

        if (isPalindrome(word)) {
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }

}
