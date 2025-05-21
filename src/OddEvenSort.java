import java.util.ArrayList;

public class OddEvenSort {
    public static String sortMyString(String s) {
        // create two output piles (left and right?)
        ArrayList<String> pile1 = new ArrayList<>();
        ArrayList<String> pile2 = new ArrayList<>();

        // how to loop through a string one character at a time. Convert string to arraylist of chars?
        // loop
        for(int i = 0; i < s.length(); i++){
            String c = s.charAt(i) + ""; //concatenate converts the char to a String

            // is it left or right (is even or odd)?
            //check to see if its even
            if(i % 2 == 0) {
                pile1.add(c);
            }else {
                pile2.add(c);
            }
        }
//        pile1.add(" "); //add the space
        // merge two array lists?
        String output = String.join("", pile1) + " " + String.join("", pile2);
        //merge two/three (" ") arrays
        // or concatenate
        //convert an arraylist of characters int a string?
        return output;
    }
    public static String sortMyString2(String s) {
        ArrayList<String> pile1 = new ArrayList<>();
        ArrayList<String> pile2 = new ArrayList<>();
        boolean isOdd = true;
        for(char c : s.toCharArray()){
            if(isOdd){
                pile1.add(c+""); //convert to string
            }else{
                pile2.add(c+"");
            }
            isOdd = !isOdd; // ! not - inverts
        }
        pile1.add(" "); //add the one space delimiter/separator
        pile1.addAll(pile2);

        return String.join("", pile1);
    }

    public static void main(String[] args) {
        String inputText = "CodeWars";
        String resultString = sortMyString2(inputText);
        System.out.println(resultString);
        String expectedText = "CdWr oeas";
        System.out.println(expectedText.equals(resultString));
    }
}
/*
Given a string s, your task is to return another string such that even-indexed and odd-indexed characters of s are grouped and the groups are space-separated. Even-indexed group comes as first, followed by a space, and then by the odd-indexed part.
Examples

input:    "CodeWars" => "CdWr oeas"
           ||||||||      |||| ||||
indices:   01234567      0246 1357

Even indices 0, 2, 4, 6, so we have "CdWr" as the first group.
Odd indices are 1, 3, 5, 7, so the second group is "oeas".
And the final string to return is "Cdwr oeas".
Notes

Tested strings are at least 8 characters long.

 */