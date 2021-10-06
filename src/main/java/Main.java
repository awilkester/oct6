package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Please input a line of text not to exceed 500 characters.");
        String inputStart = t.nextLine();
        //String test = "We are learning java in the java class taught by Safwan.";
        lengthCheck l = new lengthCheck();
        if (l.lengthCheck(inputStart)){
            System.out.println("We are going to replace the first instance of a character with another character. \n" +
                    "Please input first a character that you'd like to replace, \n " +
                    "then the character you'd like to replace it with.");
            char x = t.next().charAt(0);
            char y = t.next().charAt(0);
            oneCharReplace oCR = new oneCharReplace();
            System.out.println(oCR.oneCharReplace(inputStart, x, y));
            System.out.println("Now we are going to replace all instances of a character with another character. \n" +
                    "Please input first a character that you'd like to replace, \n " +
                    "then the character you'd like to replace it with.");
            x = t.next().charAt(0);
            y = t.next().charAt(0);
            allCharReplace aCR = new allCharReplace();
            System.out.println(aCR.allCharReplace(inputStart, x, y));
            System.out.println("Now we are going to replace the first instance of a phrase with another phrase. \n" +
                    "Please input first a phrase that you'd like to replace, \n " +
                    "then the phrase you'd like to replace it with.");
            t.nextLine();
            String c = t.nextLine();
            String d = t.nextLine();
            onePhraseReplace oPR = new onePhraseReplace();
            System.out.println(oPR.onePhraseReplace(inputStart, c, d));
            System.out.println("Now we are going to replace the all instances of a phrase with another phrase. \n" +
                    "Please input first a phrase that you'd like to replace, \n " +
                    "then the phrase you'd like to replace it with.");
            c = t.nextLine();
            d = t.nextLine();
            allPhraseReplace aPR = new allPhraseReplace();
            System.out.println(aPR.allPhraseReplace(inputStart, c, d));
            System.out.println("Now we are going delete one instance of a phrase from the text \n" +
                    "Please input a phrase to be deleted from the input text.");
            c = t.nextLine();
            delPhrase dP = new delPhrase();
            System.out.println(dP.delPhrase(inputStart, c));
            System.out.println("Congratulations, you've learned and used replacement and deletion in java!");


        }else {
            System.out.println("Sorry, that string is over 500 characters.");
        }


    }
}
