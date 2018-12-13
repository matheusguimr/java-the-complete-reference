package com.reference;

class Box {
    double width;
    double height;
    double depth;

    Box(int w, int h, int d) {
        width = w * 3;
        height = h * 4;
        depth = d * 5;
    }

    Box(Box ob) {
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1); // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}