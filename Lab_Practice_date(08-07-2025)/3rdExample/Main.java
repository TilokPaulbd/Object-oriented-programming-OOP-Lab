package com.company;

public class Main {

    public static void main(String[] args) {
     FireAlert f1=new FireAlert();
     SecurityAlert s1=new SecurityAlert();
     Alert[] a1=new Alert[2];
     a1[0]=f1;
     a1[1]=s1;

     for (Alert Al :a1){
         Al.logAlert();
         Al.triggerAlert();
     }
    }
}
