package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 80) {
            System.out.println("4");
        }
        if (x >= 75) {
            System.out.println("3.5");
        }
        if (x >= 70) {
            System.out.println("3");
        }
        if (x >= 65) {
            System.out.println("2.5");
        }
        if (x >= 60) {
            System.out.println("2");
        }
        if (x >= 55) {
            System.out.println("1.5");
        }
        if (x >= 50) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        ;


    }
}
