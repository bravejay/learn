package com.jian.test1;

import java.util.Scanner;

public class Rhombus {
    public static void  main (String [] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        for (int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("+ ");
            System.out.println();
        }
        for (int i=1;i<x;i++){
            for (int j=1;j<=i;j++)
                System.out.print(" ");
            for (int j=1;j<=x-i;j++)
                System.out.print("+ ");
            System.out.println();
        }
    }
}