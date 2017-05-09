package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {
        String word = "chicken";

        int[] table = buildCharFrequencyTable(word);
        System.out.println(checkMaxOneOdd(table));
    }

    public static int getCharNumber(Character c){ //this gets a value for the letters in the word you're looking at
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    public static int[] buildCharFrequencyTable(String phrase){ //this passes the letters into a hash table/array

        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
            }
        }
        return table;
    }

    public static boolean checkMaxOneOdd(int[] table){

        boolean foundOdd = false;
        for(int count: table){

            if(count % 2 == 1){
                if(foundOdd == true){
                    return false;
                }
                foundOdd = true;
            }

        }
        return true;

    }






}
