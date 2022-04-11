package com.lesson2;

public class noMainZero {

    public static void main(String[] args) {

        // write your code here (4.	переменная x больше или равно -10 и меньше 15 и не равно 8; х=-1)
        int x = -1;
        String rezult = ((x >= -10 && x < 15) && (x != 8)) ? "Входит в диапазон" : "не входит в диапазон";
        System.out.println(rezult);
    }
}


