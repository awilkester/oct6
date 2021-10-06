package main.java;

public class delPhrase {
    /**
     * deletes the first instance of a specified phrase in a specified string
     * @param input : the string to be worked on
     * @param x : the phrase to be deleted
     * @return typeOf String : the result after deletion
     */
    public static String delPhrase(String input, String x){
        StringBuilder result = new StringBuilder(input);
        result.delete(input.indexOf(x), input.indexOf(x) + x.length() + 1);
        return result.toString();
    }
}
