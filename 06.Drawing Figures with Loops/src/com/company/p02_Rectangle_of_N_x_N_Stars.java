package com.company;

import java.util.Scanner;

public class p02_Rectangle_of_N_x_N_Stars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
