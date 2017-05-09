package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        String phrase1 = "aaabbbccc";
        String phrase2 = "mmmmmmmmmmmmmmddd";
        String phrase3 = "aabbey";
        System.out.println(phrase1 + " <<< : >>> " + compressString(phrase1));
        System.out.println(phrase2 + " <<< : >>> " + compressString(phrase2));
        System.out.println(phrase3 + " <<< : >>> " + compressString(phrase3));


   }

//    public static String compressString(String phrase){
//
//        String compressedString = ""; //create an empty string to passed stuff into it
//        int countConsecutive = 0; //create a counter to keep track of the number of letters
//        for(int i = 0; i < phrase.length(); i++){ //cycle through all elements in the string
//            countConsecutive++; //increment your counter 1 time because you've just encountered a letter :)
//
//            if(i + 1 >= phrase.length() || phrase.charAt(i) != phrase.charAt(i+1)){ //if ( you cycler + 1 is equal to or beyond the length of the string OR if the two values next to each other aren't equal...
//                compressedString += "" + phrase.charAt(i) + countConsecutive; //add items to the compressed string
//                countConsecutive = 0; //reset your counter cuz you're about to go to a new letter
//            }
//        }
//
//        return compressedString.length() < phrase.length() ? compressedString : phrase; //check if the compressedString you just created...if it's less than the length of the original string, print the compressedString, otherwise print the original phrase/string from the argument
//
//    }

//

    public static String compressString(String bravo){
        String comppressedString = "";
        int counter = 0;

        for(int i = 0; i < bravo.length(); i++){
            counter++;

            if( i+1 >= bravo.length() || bravo.charAt(i) != bravo.charAt(i + 1)){
                comppressedString += bravo.charAt(i) + counter;
                counter = 0;
            }
        }
        return comppressedString.length() < bravo.length() ? comppressedString : bravo;


    }
}
