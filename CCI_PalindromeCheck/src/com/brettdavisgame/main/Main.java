package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        boolean test1 = palindromeCheck("chicken");
        boolean test2 = palindromeCheck("aabaa");
        boolean test3 = palindromeCheck("cccccdccccc");
        boolean test4 = palindromeCheck("abbey");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

    }

    public static boolean palindromeCheck (String word){

        int i = 0;
        int j = word.length() - 1;

        while(j>i){

            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
