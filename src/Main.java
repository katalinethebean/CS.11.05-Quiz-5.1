public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int[] combine;
        combine = new int[array1.length+array2.length];
        for (int i = 0; i<array1.length; i++){
            combine[i] = array1[i];
        }
        for (int b = 0; b<array2.length; b++){
            combine[b+array1.length] = array2[b];
        }
        return combine;
    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] zip;
        zip = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            zip[2 * i] = array1[i];
            zip[2 * i + 1] = array2[i];
        }
        return zip;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
        int[] product;
        product = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            product[i] = array1[i]*array2[i];
        }
        return product;
        }


        /**
         * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
         * The method capitalCount will return a new one dimensional array of integers.
         * There is a catch - you are required to implement *two* methods in order to solve this problem.
         * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
         * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
         * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
         *
         * Method: capitalCount
         * Helper method: countCapitalLetters
         *
         * Hint: 'A' = 65 and 'Z' = 90
         *
         * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
         * capitalCount(words) → {1, 2, 2, 0}
         */
    public static int[] capitalCount(String[] words) {
        int[] capitalCount;
        capitalCount = new int[];
        for(int i = 0; i < words.length(); i++){
            int charCode = (int) words[i];
            int count = 0;
            if (charCode > 64 && charCode < 91){
                count++;
            }

        }


    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            int charCode = (int) word[i];
            if (charCode > 64 && charCode < 91){
                count++;
            }
        }
        return count;
    }
}
