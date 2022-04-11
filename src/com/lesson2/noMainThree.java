package com.lesson2;

public class noMainThree {
    public static void main(String[] args) {
        // write your code here
        int a1 = 10000000; // население
        int b1 = 14; // Рождаемость на 1000 человек
        int c3 = 8; // смертность
        int growth = b1 - c3; // прирост
        for (
                int y = 1;
                y <= 10; y++) {
            a1 = a1 + a1 * growth / 1000;
        }
        System.out.println(a1);
    }
}
