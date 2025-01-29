import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //pirveli davaleba
        String string = "String";
        System.out.println("String length: " + string.length());

        //Meore davaleba

        String sentences = "This is a test. to find out how many sentences are here. whoo! right?";
        int sentanceamount = 0;

        for(int i = 0; i < sentences.length(); i++){
            if(sentences.toCharArray()[i] == '.' | sentences.toCharArray()[i] == '?' |sentences.toCharArray()[i] == '!'){
                sentanceamount++;
            }
        }

        System.out.println("sentence amount: " + sentanceamount);


        //mesame davaleba

        String normalString = "civic";
        char[] Characters = normalString.toCharArray();
        String reversedString = new String();
        boolean ispalindrome = false;

        for(int i = normalString.length()-1; i >= 0; i--){
            reversedString += (Character.toString(Characters[i]));
        }

        if(reversedString.equals(normalString))ispalindrome = true;

        System.out.println(reversedString);

        System.out.println("is palindrome: " + ispalindrome);


        //meotxe davaleba

        String s1 = "abcdefg", s2  = "abc";

        System.out.println("does the first sentance contain the second one: " + (s1.contains(s2)? "Yes" : "No"));

        //Mexute davaleba

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String");

        String Xmovani = myObj.nextLine();

        String xmovnebi[] = {"a", "e", "i", "o", "u", "y"};

        boolean xmovani = false;

        for(int i = 0; i < xmovnebi.length; i++) {
            if ((Xmovani.endsWith(xmovnebi[i]))) {
                xmovani = true;
                break;
            }
        }

        System.out.println("ends with a vowl: " + ((xmovani)? "Yes" : "No"));

        //meeqvse davaleba

        String NitasString = "AABBCCEEF";
        char lastChar = 'a';
        String FinalResult = "";

        for(int i = 0; i < NitasString.length(); i++){
            if(i == 0) {
                lastChar = (NitasString.toCharArray())[i];
                continue;
            }

            if(NitasString.toCharArray()[i] == lastChar){
                FinalResult  += Character.toString(lastChar);
            }else{
                lastChar = (NitasString.toCharArray())[i];
            }
        }

        System.out.println(FinalResult);

        //meshvide davaleba

        String LongWord = "Initialization";
        String GiantWord = "";

        if(LongWord.length() > 10){
            GiantWord += LongWord.charAt(0);
            GiantWord += "(" + LongWord.length() + ")";
            GiantWord += LongWord.charAt(LongWord.length()-1);
        }

        System.out.println(GiantWord);
    }
}