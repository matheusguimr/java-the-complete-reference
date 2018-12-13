package com.reference;

class UsandoStaticMetodos {
    static int a = 3;
    static int b;

    static void meth(int... x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        printArray(x);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String args[]) {
        meth(42, 45, 54, 23, 22, 13, 12);
    }

    static void printArray(int... vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}