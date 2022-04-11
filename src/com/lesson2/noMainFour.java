package com.lesson2;

import java.util.Scanner;

public class noMainFour {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        float a = in.nextInt();
        System.out.print("Введите кол-во месяцев: ");
        int b = in.nextInt();
        int i = b;
        while (i > 0) {
            a = a + a / 100 * 7;
            i--;
        }
        System.out.println("Итоговая сумма: " + a);
    }
}

