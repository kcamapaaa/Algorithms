package com.arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello!"));
    }

    // Без использования методов reverse
    public static String reverseString(String str) {
        if(str == null) {
            return "No string";
        }

        char[] array = str.toCharArray();
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return new String(array);
    }

    // С использованием метода реверс StringBuilder
    public static String reverseStringWithReverseMethods(String str) {
        if(str == null) {
            return "No string";
        }
        return new StringBuilder(str).reverse().toString();
    }
}
