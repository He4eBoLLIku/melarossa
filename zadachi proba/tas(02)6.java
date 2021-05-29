package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 100 == 0 && a % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (a % 4 == 0 && a % 100 > 0) {
            System.out.println("количество дней в году: 366");
        } else if (a % 100 == 0) {
            System.out.println("количество дней в году: 365");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}