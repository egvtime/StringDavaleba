import java.util.Scanner;

public class StringActions {

    //pirveli davaleba

    public static void PrintLength(String string) {
        System.out.println("String length: " + string.length());
    }

    //meore davaleba

    public static int SentanceAmount(String sentences) {
        int sentanceamount = 0;

        for (int i = 0; i < sentences.length(); i++) {
            if (sentences.toCharArray()[i] == '.' | sentences.toCharArray()[i] == '?' | sentences.toCharArray()[i] == '!') {
                sentanceamount++;
            }
        }

        return sentanceamount;
    }

    //mesame davaleba

    public static boolean IsPalindrome(String normalString) {
        char[] Characters = normalString.toCharArray();
        StringBuilder reversedString = new StringBuilder(new String());
        boolean ispalindrome = false;

        for (int i = normalString.length() - 1; i >= 0; i--) {
            reversedString.append(Character.toString(Characters[i]));
        }

        if (reversedString.toString().equals(normalString)) ispalindrome = true;

        return ispalindrome;

    }


    //meotxe davaleba

    public static boolean ContainsString(String s1, String s2) {
        return s1.contains(s2);
    }


    //Mexute davaleba

    public static boolean ContainsVowels(String Word) {
        String xmovnebi[] = {"a", "e", "i", "o", "u", "y"};

        boolean xmovani = false;

        for (int i = 0; i < xmovnebi.length; i++) {
            if ((Word.endsWith(xmovnebi[i]))) {
                xmovani = true;
                break;
            }
        }

        return xmovani;
    }

    //meeqvse davaleba

    public static StringBuilder UnravelNitasString(String NitasString) {
        char lastChar = 'a';
        StringBuilder FinalResult = new StringBuilder();

        for (int i = 0; i < NitasString.length(); i++) {
            if (i == 0) {
                lastChar = (NitasString.toCharArray())[i];
                continue;
            }

            if (NitasString.toCharArray()[i] == lastChar) {
                FinalResult.append(Character.toString(lastChar));
            } else {
                lastChar = (NitasString.toCharArray())[i];
            }
        }

        return FinalResult;
    }

    //meshvide davaleba

    public static String GiantWordConverter(String LongWord) {

        String GiantWord = "";

        if (LongWord.length() > 10) {
            GiantWord += LongWord.charAt(0);
            GiantWord += "(" + LongWord.length() + ")";
            GiantWord += LongWord.charAt(LongWord.length() - 1);
        }

        return GiantWord;
    }
}

