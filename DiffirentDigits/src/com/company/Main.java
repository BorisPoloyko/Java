package com.company;

/**
 * @author Boris Poloyko
 *
 *
 *
 * */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the amount of elements: ");
        int n = DataReader.readNumber();
        int[] array = new int [n];
        com.company.arrays.Arrays.fillArray(array);
        com.company.arrays.Arrays.displayArray(array);
        System.out.print(Digits.findDiffDigits(array));
    }
}
