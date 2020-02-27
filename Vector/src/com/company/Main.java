package com.company;

import com.company.vector.Vector;

public class Main {

    public static void main(String[] args) {
        Vector[] array = Vector.createArray(2);
        array = Vector.fillArray(array, 3);
        Vector.displayArray(array);
    }
}
