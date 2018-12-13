package com.reference;

class TestObject {
    int a, b;

    TestObject(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(TestObject o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

public class ObjectsAsParameters {
    public static void main(String args[]) {
        TestObject ob1 = new TestObject(100, 22);
        TestObject ob2 = new TestObject(100, 22);
        TestObject ob3 = new TestObject(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}