package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Please input a line of text not to exceed 500 characters.");
        String inputStart = t.nextLine();
        String test = "We are learning java in the java class taught by Safwan.";
        lengthCheck l = new lengthCheck();
        if (l.lengthCheck(test)){
            System.out.println("Please input first a character that you'd like to replace, then the character you'd like to replace it with; in the format of x y.");
            char x = t.next().charAt(0);
            char y = t.next().charAt(2);


        }else {
            System.out.println("Sorry, that string is over 500 characters.");
        }


    }
}
