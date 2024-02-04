// src/main/java/myjavaproject/Utils.java

package myjavaproject;

public class Utils {

    // Task: Implement the following utility functions

    // Function 1: Reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Function 2: Capitalize the first letter of a string
    public static String capitalizeFirstLetter(String str) {
        str = str.substring(0, 2).toUpperCase() + str.substring(1);
        return str;
    }
}
