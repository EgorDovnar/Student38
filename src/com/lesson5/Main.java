package com.lesson5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создайте массив с целочисленными значениями, найдите сумму всех чисел через foreach.
        int[] array = new int[]{2, 2, 2};
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        // System.out.println("Сумма : " + sum);

        //Создайте массив объектов Animal с полями имя, возраст, вес. Найдите общую сумму веса по всем животным.
        Animal cat = new Animal("Cat", 1, 2);
        Animal dog = new Animal("Dog", 1, 2);
        Animal bird = new Animal("Bird", 2, 1);

        Animal arrayAnimal[] = {cat, dog, bird};
        int sumWeight = 0;
        for (Animal weight : arrayAnimal) {
            sumWeight = sumWeight + weight.getWeight();
        }
        // System.out.println("Сумма : " + sumWeight);


        int Array[] = new int[12];
        Random random = new Random(0);
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(15);
            System.out.print(Array[i] + " ");
        }

        int max = Array[0], index = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= max) {
                max = Array[i];
                index = i;
            }
        }
        System.out.println("");
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);

    }
}
