package main.java;


public class allPhraseReplace {
    /**
     * replaces all instances of a specified phrase with another specified phrase
     * @param input : the string to be worked on
     * @param x : the phrase to be replaced
     * @param y : the phrase that is doing the replacing
     * @return typeOf String : the result after replacement
     */
    public static String allPhraseReplace(String input, String x, String y){
        String result = input.replace(x, y);
        return result;
    }
}
