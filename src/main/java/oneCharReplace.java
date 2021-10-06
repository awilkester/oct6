package main.java;

public class oneCharReplace {

    public static String oneCharReplace(String input, char x, char y){
        StringBuilder result = new StringBuilder(input);
        int i = input.indexOf(x);
        result.replace(i, i+1, Character.toString(y));
        return result.toString();
    }

    public static void main(String[] args) {

    }

}
