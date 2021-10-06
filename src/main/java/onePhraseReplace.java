package main.java;

public class onePhraseReplace {
    public static String onePhraseReplace(String input, String x, String y){
        StringBuilder result = new StringBuilder(input);
        int i = input.indexOf(x);
        result.replace(i, i+1, y);
        return result.toString();
    }
}
