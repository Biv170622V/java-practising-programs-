package org.example;
//swapping two numbers without using temporary variable
public class SwapWithoutTemp {

    public static void swapNumbers(int a,int b){
        a=a+b;
        System.out.println(a);
        b=a-b;
        System.out.println(b);
        a=a-b;
        System.out.println(a);
        System.out.println("after swapped a:"+a+" b:"+b);
    }
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("before swapping a:"+a+" b:"+b);
        swapNumbers(a,b);
    }

}
