package com.reference;

public class JavaOperators {
    public static void main(String[] args) {
        String s1 = "Hello";
        if (s1 instanceof java.lang.String) {
            System.out.println("s is a String");
        }

        String s2 = "Hello";

        if (s1.equals(s2)) {
            System.out.println("They match");
        } else {
            System.out.println("No match");
        }

    }
}
