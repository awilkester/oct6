package main.java;

public class delPhrase {
    public static String delPhrase(String input, String x){
        StringBuilder result = new StringBuilder(input);
        result.delete(input.indexOf(x), input.indexOf(x) + input.length());
        return result.toString();
    }
}
