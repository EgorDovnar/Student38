package com.lesson2;

import java.util.Scanner;

public class noMainTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();
        switch ((x < y) ? 0 : (x > y) ? 1 : (x == y) ? 2 : 3) {
            case 0:
                System.out.println("первое число меньше второго");
                break;
            case 1:
                System.out.println("первое число больше второго");
                break;
            case 2:
                System.out.println("числа равны");
        }
    }
}
