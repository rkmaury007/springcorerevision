package org.rkm.DataStructure;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Palindrom {
    static boolean isPalindrom(String s){
        int l=0;
        int h=s.length()-1;
        while(h>l){
            if(s.charAt(l++) != s.charAt(h--))
                return false;
        }
        return true;
    }
    public static String removeDuplicates(String myString) {
        //return Arrays.asList(myString.split("")).stream().distinct().collect(Collectors.joining());
        return Arrays.asList(myString.split("")).stream().distinct().collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("abcba"));
        System.out.println(removeDuplicates("qwewqa"));
    }
}
