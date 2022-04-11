package com.lesson2;

public class noMainOne {
    public static void main(String[] args) {
        // write your code here (4.	переменная x больше или равно -10 и меньше 15 и не равно 8; х=-1)
        int x = -1;
        switch ((x < -11) ? 0 : (x > 15) ? 1 : (x == 8) ? 2 : 3) {
            case 0:
                System.out.println("Меньше -10");
                break;
            case 1:
                System.out.println("Больше 15");
                break;
            case 2:
                System.out.println("Равно 8");
                break;
            default:
                System.out.println("Соответствует формуле");
        }
    }
}
