package array.counting.vowel;

public class Main {
    public static void main(String[] args) {

        // The string given
        String stringToTravel = "TONI says ice cream PER scoop";

        // The variable to count the number of vowels
        int countVowels = 0;
        int contConsonant = 0;

        // Converting the string to its lowercase
        stringToTravel = stringToTravel.toLowerCase();

        //this method charAt() returns the character at the index number given using if else statement
        /**
         for(int indexPosition = 0; indexPosition < stringToTravel.length(); indexPosition++)
        {
            char ch = stringToTravel.charAt(indexPosition);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                countVowels++;
            } else if(ch != ' ' && Character.isLetter(ch))
            {
                contConsonant++;
            }
        }
         **/

        // this method charAt() returns the character at the index number given using for statement
        char[] vowelsArray = {'a','e','i','o','u'};

        for(int indexPosition = 0; indexPosition < stringToTravel.length(); indexPosition++)
        {
            char ch = stringToTravel.charAt(indexPosition);
            boolean isVowel = false;

            for (int i = 0; i < vowelsArray.length; i++)
            {
                if (ch == vowelsArray[i])
                {
                    isVowel = true;
                    break;
                }
            }
            if(isVowel) {
                countVowels++;
            } else if (ch != ' ' && Character.isLetter(ch))
            {
                contConsonant++;
            }
        }

        // this method will return reverse of the string using for loop
        /**
         * String reversed = "";
         *         for(int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
         *             char ch = stringToReverse.charAt(indexPosition);
         *             reversed = reversed + ch;
         *         }
         **/

        System.out.println("\nThe total number of vowels in the String is: " + countVowels);
        System.out.println("The total number of consonants in the String is: " + contConsonant);
        System.out.println("The total number of letters in the String is: " + (countVowels+contConsonant));
        System.out.println("The size of array String is: " + stringToTravel.length());
        System.out.println("The String is: " + stringToTravel);
        System.out.println("The String in reverse order is: " + new StringBuilder(stringToTravel).reverse());
    }
}