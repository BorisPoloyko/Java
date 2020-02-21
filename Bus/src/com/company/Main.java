package com.company;

import com.company.bus.Bus;
import com.company.input.ValueReader;

/**
 * @author Boris Poloyko
 * <p>Received on 14.02.2020
 * <p>Completed on 21.02.2020
 */

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the amount of buses: ");
        int n = ValueReader.intReader();
        Bus[] array = Bus.createArray(n);
	    array = Bus.fillArray(array, n);
	    Bus.displayArray(array, n);
    }
}
