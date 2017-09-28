package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ввести n чисел с консоли (например, 45 5 67 456)
        System.out.println("Введите целые числа через пробел и нажмите <Enter>: ");
        Scanner scan = new Scanner(System.in);
        String arr = scan.nextLine(); // вводим строку
        scan.close();
        String[] newArr = arr.split(" ");
        int numArr[] = new int[newArr.length]; // перевод строки в масив целых чисел
        for (int i = 0; i < numArr.length; i++) {
            // перевод числа в строковый массив, разбиение на отдельные цифры и подсчёт их количества. Получим количество цифр в числе
            numArr[i] = Integer.parseInt(newArr[i]);
            int a = numArr[i];
            String newa = Integer.toString(a);
            String[] newA = newa.split("");
            System.out.println("newA = " + Arrays.toString(newA));
            // После этой строки, в принципе, я могу получить длину i-го элемента (скажем, 1-го = 2) и получаю массив newA [] = {4, 5}.
            int newA2[] = new int[newA.length]; // новый массив из элементов предыдущего массива
            // дальше и заключается проблема. в новом массиве, который содержит цифры первого числа, я их пытаюсь сравнивать и
            // выполнять другие операции, но что-то делаю не так
            for (int j = 0; j < newA2.length; j++) {
                newA2[j] = Integer.parseInt(newA[j]);
                if (newA2[j] < newA2[j+1]){
                    System.out.println("OK");
                }
                else
                    System.out.println("non");
                // результат
              /*  Exception in thread "main" newA = [4, 5]
                non
                java.lang.ArrayIndexOutOfBoundsException: 2
                at com.company.Main.main(Main.java:26) */
            }
            System.out.println("newA2 = " + Arrays.toString(newA2));

        }
    }
}
