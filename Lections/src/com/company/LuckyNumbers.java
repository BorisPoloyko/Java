package com.company;

public class LuckyNumbers {
    public static void printLucky(int[] a){
        String number;
        for (int i : a) {
            number = Integer.toString(i);
            if (number.length() == 4
                    && Integer.parseInt(String.valueOf(number.charAt(0)))+ Integer.parseInt(String.valueOf(number.charAt(1))) == Integer.parseInt(String.valueOf(number.charAt(2)))
                    + Integer.parseInt(String.valueOf(number.charAt(3)))) {
                System.out.print(number + " ");
            }
            else{
                System.out.print("No happy numbers in array!");
            }
        }
    }
}
