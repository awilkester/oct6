package main.java;

public class oneCharReplace {

    /**
     * replaces the first instance of a specified char with another specified char
     * @param input : the string to be worked on
     * @param x : the character to be replaced
     * @param y : the character that is doing the replacing
     * @return typeOf String : the result after replacement
     */
    public static String oneCharReplace(String input, char x, char y){
        StringBuilder result = new StringBuilder(input);
        int i = input.indexOf(x);
        result.replace(i, i+1, String.valueOf(y));
        return result.toString();
    }

}
