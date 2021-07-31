package com.test;

import java.util.Scanner;

public class maxGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxGrade=0;
        System.out.print("输入人数：");
        int number=scan.nextInt();
        System.out.println("输入分数：");
        int[] arr = new int[number];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();}
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=maxGrade){
                maxGrade=arr[i];
            }
        }
        System.out.print("最高分："+maxGrade);
    }
}
