public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG          ";
        System.out.println("Original: -" + original + "-");

        /*
        *   Interesting functions for string variables:
        *
        *   1 - Formatting
        *   2 - Cutting
        *   3 - Replacing
        *   4 - Fetching
        *   5 - Splitting
        *
        * */

        // convert the string for lower case
        String s01 = original.toLowerCase();
        System.out.println("Lower Case: -" + s01 + "-");

        // convert the string for upper case
        String s02 = original.toUpperCase();
        System.out.println("Upper Case: -" + s02 + "-");

        // eliminates blank spaces
        String s03 = original.trim();
        System.out.println("Trim: -" + s03 + "-");

        // substring with only initial declaration
        String s04 = original.substring(2);
        System.out.println("Substring(2): -" + s04 + "-");

        // substring with initial and final declaration
        String s05 = original.substring(2,10);
        System.out.println("Substring(2,10): -" + s05 + "-");

        // replacing a -> x
        String s06 = original.replace('a', 'z');
        System.out.println("Replacing(a for z): -" + s06 + "-");

        // replacing a substring
        String s07 = original.replace("abcde", "TEST");
        System.out.println("Replacing(abcde for TEST): -" + s07 + "-");

        /*  searching a string (difference)
        *   indexOf = first occurrence
        *   lastIndexOf = last occurrence
        */
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        // split operation
        String example = "hamburger, french fries, coke";

        String[] vector = example.split(", ");

        String firstWord = vector[0];
        String secondWord = vector[1];
        String thirdWord = vector[2];

        System.out.println("Example: " + example);
        System.out.println("First Word: " + firstWord);
        System.out.println("Second Word: " + secondWord);
        System.out.println("Third Word: " + thirdWord);

    }
}