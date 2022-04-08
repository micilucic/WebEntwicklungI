package com.company;

public class Handy {

    public static void main(String[] args) {

        String[] smartphoneNamen = {"Samsung A51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7"};

        int[][] smartphoneVerkauf = {{2000, 3000, 4000, 1000},
                {2000, 3000, 4000, 1000},
                {2000, 3000, 4000, 1000},
                {2000, 3000, 4000, 1000},
                {2000, 3000, 4000, 1000}};


        for (int sIndex = 0; sIndex < smartphoneNamen.length; sIndex++) {
            System.out.println(smartphoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkauf[sIndex].length; ++qIndex) {
                System.out.println(smartphoneVerkauf[sIndex][qIndex] + ": ");
            }
            System.out.println();
        }

    }

}
