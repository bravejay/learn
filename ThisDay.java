package com.jian.test1;
import java.util.Scanner;
public class ThisDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入年份：");
        int thisYear = scan.nextInt();
        System.out.print("输入月份：");
        int thisMonth = scan.nextInt();
        System.out.print("输入日期：");
        int thisDay = scan.nextInt();
        int sumDays=0;
        switch (thisMonth){
            case 12:
                sumDays+=31;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
                if ((thisYear % 4 ==0 && thisYear % 100 != 0) && (thisYear % 400 ==0 ))
                    sumDays+=29;
                else
                    sumDays+=28;
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=thisDay;
        }
        System.out.println("这是第"+sumDays+"天");
    }
}
