package com.company;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public Integer add(String a ,int b){
        int num=Integer.parseInt(a);
         int sum =num+b;
          return sum;
    }
}
