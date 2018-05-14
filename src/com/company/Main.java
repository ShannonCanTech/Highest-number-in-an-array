package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1, 4, -6, 5, 8};

        System.out.println(adjacentElementsProduct(inputArray) + " is the highest number.");
    }

        public static int adjacentElementsProduct(int[] inputArray) {

            int product = inputArray[0];

            for (int i = 0; i < inputArray.length; i++) {

                if (inputArray[i] > product ){
                    product = inputArray[i];
                }
            }

            return product;
        }
}
