package main.java;

public class allCharReplace {

    /**
     * replaces all instances of a specified char with another specified char
     * @param input : the string to be worked on
     * @param x : the character to be replaced
     * @param y : the character that is doing the replacing
     * @return typeOf String : the result after replacement
     */
    public static String allCharReplace(String input, char x, char y){
        String result = input.replace(x, y);
        return result;
    }
}
