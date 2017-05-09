package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        String[][] pairs = {{"apples", "ppales"}, {"abbey", "bbeya"}, {"bruce", "bruc"}};
        for(String[] pair: pairs){ //for every pair of words in the set of pairs
            String word1 = pair[0]; //word1 is the first word of a set
            String word2 = pair[1]; //word2 is the second word of a set
            boolean anagram = permutation(word1, word2); //check if they're equal in permutation
            System.out.println((word1 + ", " + word2 + ": " + anagram)); //print them
        }
    }

//    public static String sort(String phrase){
//
//        char[] characters = phrase.toCharArray(); //take all the characters from the string and input them into an array
//        java.util.Arrays.sort(characters); //sort the array
//        return new String(characters); //return a new string of the sorted array
//    }
//
//    public static boolean permutation(String alpha, String bravo){
//        return sort(alpha).equals(sort(bravo)); //compare two strings to see if they're equal to the other
//    }

    public static String sort(String words){
        char[] characters = words.toCharArray();
        java.util.Arrays.sort(characters);
        return new String(characters);
    }

    public static boolean permutation(String alpha, String bravo){
        return sort(alpha).equals(sort(bravo));
    }
}
