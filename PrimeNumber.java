package com.jian.test1;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isFlag=true;
        for(int i=1;i<100;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if (isFlag==true)
                System.out.println(i);
            isFlag=true;
        }
    }

}
