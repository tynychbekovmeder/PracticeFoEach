package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[120];

        array(arr);

    }

    static void array(int[] arr) {
        for (int i = 10; i < arr.length; i += 10) {
            arr[i] = i;
            if (arr[i] % 3 == 0) {
                arr[i] = 3333333;
            }
            arr[arr.length / 2] = -1;

            System.out.print(arr[i] + ", ");
        }
    }


    static int[] arrayFactory(int a, int b, int c, int d, boolean ascending) {
        int[] array = new int[]{a, b, c, d};
        if (ascending) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int template = array[i];
                        array[i] = array[j];
                        array[j] = template;
                    }
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int template = array[i];
                        array[i] = array[j];
                        array[j] = template;
                    }
                }
            }
        }
        return array;
    }
}
