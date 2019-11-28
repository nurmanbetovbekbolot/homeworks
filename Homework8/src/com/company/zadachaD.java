package com.company;

public class zadachaD {
    public static void main(String[] args) {
        for (int i = 0; i < 225 / 15; i++) {
            for (int j = 0; j < 225 / 17; j++) {
                for (int k = 0; k < 225 / 21; k++) {
                    for (int l = 0; l < 225 / 23; l++) {
                        for (int m = 0; m < 225 / 25; m++) {
                            if (i * 15 + j * 17 + k * 21 + l * 23 + m * 25 == 185) {
                                System.out.printf("%d %d %d %d %d\n", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}