package com.company;

public class Fibonocci {
    static int num1=0,num2=1,num3,i,n=10;

    public static void main(String[] args) {
        // write your code here
        Fibonocci f = new Fibonocci();
        f.fibonocci();
    }
    public void fibonocci(){
        System.out.print(num1+" "+num2);

        for(i=2;i<=n;i++){

            num3=num1+num2;
            System.out.print(" "+num3);

            num1=num2;
            num2=num3;

        }
    }
}

