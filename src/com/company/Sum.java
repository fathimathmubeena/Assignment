

package com.company;

public class Sum {
    int i,n=20,sum=0;



    public static void main(String[] args) {
        Sum m = new Sum();

        m.sumByFor();
        m.sumByWhile();
    }
    public void sumByFor(){

        for(i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of first " +n+ " natural numbers using for loop is " +sum);
        sum=0;
        i=0;
    }

    public void sumByWhile(){

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The sum of first " +n+ " natural numbers using while loop is " +sum);
    }
}
