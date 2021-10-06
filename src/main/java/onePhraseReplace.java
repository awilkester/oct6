package main.java;

public class onePhraseReplace {
    /**
     * replaces the first instance of a specified phrase with another specified phrase
     * @param input : the string to be worked on
     * @param x : the phrase to be replaced
     * @param y : the phrase that is doing the replacing
     * @return typeOf String : the result after replacement
     */
    public static String onePhraseReplace(String input, String x, String y){
        StringBuilder result = new StringBuilder(input);
        int i = input.indexOf(x);
        result.replace(i, i+x.length(), y);
        return result.toString();
    }
}
