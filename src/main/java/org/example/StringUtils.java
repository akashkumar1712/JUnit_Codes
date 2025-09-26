package org.example;

public class StringUtils {
    public static boolean isPalindrome(String str){
        if(str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals((reversed));
    }
}
