import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String");
        String StringOne = scanner.nextLine();

        System.out.println("Enter a second String");
        String StringTwo = scanner.nextLine();

        StringActions.PrintLength(StringOne);

        System.out.println(StringActions.SentanceAmount(StringOne));

        System.out.println(StringActions.IsPalindrome(StringOne));

        System.out.println(StringActions.ContainsString(StringOne, StringTwo));

        System.out.println(StringActions.ContainsVowels(StringOne));

        System.out.println(StringActions.UnravelNitasString(StringOne));

        System.out.println(StringActions.GiantWordConverter(StringOne));
    }
}