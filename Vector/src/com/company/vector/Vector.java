package com.company.vector;

import java.util.Arrays;
import java.util.StringJoiner;

public class Vector {
    private
    int[] vct;

    public Vector(int n) {
        this.vct = new int[n];
    }

    public Vector(int[] vct) {
        this.vct = vct;
    }

    public int getLength(){
        return this.vct.length;
    }

    public void setVct(int[] vct) {
        this.vct = vct;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vector.class.getSimpleName() + "[", "]")
                .add("vector = " + Arrays.toString(vct))
                .toString();
    }

    public int getElement(int index){
        return this.vct[index];
    }

    public void setElement(int index, int value){
        this.vct[index] = value;
    }

    public void increment(int value){
        for (int i = 0; i < this.getLength(); i++){
            this.setElement(i, getElement(i) + value);
        }
    }

    public void decrement(int value){
        for (int i = 0; i < this.getLength(); i++){
            this.setElement(i, getElement(i) - value);
        }
    }
    public static Vector[] createArray(int m){
        Vector[] array = new Vector[m];
        return array;
    }

    public static Vector[] fillArray(Vector[] array, int n){
        for(int i = 0; i < array.length; i++){
            System.out.println("Filling the " + i + 1 + " vector");
            {
                array[i] = new Vector(n);
                for(int j = 0; j < array[i].getLength(); j++){
                    System.out.println(j + 1 + " element: ");
                    array[i].setElement(j, DataReader.intReader());
                }
            }
        }
        return array;
    }

    public static  void displayArray(Vector[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i].toString());
        }
    }

}
