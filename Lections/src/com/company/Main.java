package com.company;

import com.company.array.Arrays;
import com.company.test.reader.DataReader;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter the amount of elements: ");
        int n = DataReader.readNumber();
        int[] array = new int [n];
        Arrays.fillArray(array);
        Arrays.displayArray(array);
        LuckyNumbers.printLucky(array);
    }
}
