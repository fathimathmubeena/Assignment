package com.company;

public class Largest {
    public static void main(String[] args) {
        // write your code here
        Largest m = new Largest();
        int num1=10;
        int num2=20;
        int num3=30;
        String type="condition";

        switch(type){
            case "condition":
                m.largestByIfelse(num1,num2,num3);
                break;

            case "ternary":
                m.largestByternary(num1,num2,num3);
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
    public void largestByIfelse(int num1,int num2,int num3){
        int large;
        if(num1>num2 && num1>num3){
            large=num1;
        }
        else if(num2>num1 && num2>num3){
            large=num2;
        }
        else{
            large=num3;
        }
        System.out.println("The largest number is "+large);
    }

    public void largestByternary(int num1,int num2,int num3){
        int large,temp;
        temp=num1>num2?num1:num2;
        large=num3>temp?num3:temp;
        System.out.println("The largest number is "+large);
    }
}


