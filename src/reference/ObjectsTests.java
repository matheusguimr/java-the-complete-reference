package com.reference;

import java.util.Random;

class Test1 {

    public static void main(String[] args) {
        int[] array1 = new int[50];
        array1[0] = 1;
        showNumbers(arrayForEach(array1));
    }

    static int[] arrayForEach(int[] array_temp) {
        int sum = 1;
        for (int x : array_temp) {
            sum *= x;
        }
        return array_temp;
    }

    static void showNumbers(int[] array_temp) {
        for (int i = 0; i < array_temp.length; i++) {
            System.out.println(array_temp[i]);
        }
    }

    static int[] randomNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            number[i] = new Random().nextInt(10000);
        }
        return number;
    }
}

public class ObjectsTests {
    public static void main(String[] args) {
        Test1 object1 = new Test1();
        Box object2 = new Box(10, 2, 5);

        int[] array2 = new int[100];

        object1.randomNumber(array2);

        object1.showNumbers(array2);

        System.out.println(object2.volume());

    }
}
