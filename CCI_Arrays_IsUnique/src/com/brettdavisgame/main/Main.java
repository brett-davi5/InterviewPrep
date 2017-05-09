package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        String[] words = {"abcde", "efghi", "jklmn", "xxxxx"};
        for(int i = 0; i < words.length; i++){
            System.out.println("Word at " + i + " is " + isUnique(words[i]));

        }



    }


    public static boolean isUnique(String phrase){
        if(phrase.length() > 128){ //if the phrase is greater than 128, this can't be true
            return false;
        }

        boolean[] charSet = new boolean[128]; //create an array to input true & false values

        for(int i = 0; i < phrase.length(); i++){
            int value = phrase.charAt(i); //find the value of the character @ i
            if(charSet[value]) //check if the boolean at value index is already marked true
                return false; //if so, return false

            charSet[value] = true; //if not, this means we haven't checked it as true yet, so mark it true
        }
        return true; //if you can get through the whole array without finding a repeat, return true (cuz it's unique!)  :P
    }
}
