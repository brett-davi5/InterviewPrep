package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        //Implement an algorithm to determine if a string has all unique
        //characters . What if you cannot use a data structure?

        String testingInput = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(isUniqueChars(testingInput));

        System.out.println(isUniqueChars("iuytrelkjhu"));


    }

    public static boolean isUniqueChars(String string){
        boolean[] flag = new boolean[128]; //create a new array of booleans
        //this means each one will be true/false

        for(int i = 0; i < string.length(); i++){ //loop through the length of the string
            int value = string.charAt(i);//create a value corresponding to the letter at the array index
            //ie, a = 1, b = 2, c = 3, etc.
            //each letter gets a unique value so if you see it again, obviously it's already in the array!
            if(flag[value]){ //if the flag value (true or false) at index value (1, 2, 3, etc.) is true,
                //then return false because we've already found this char in the string
                return false;
            }//otherwise we haven't seen this value before so we'll mark it as true, this way if we see it again (line 23),
            //we can record that it's already in the array
            flag[value] = true;
        }
        return true;
    }
}
