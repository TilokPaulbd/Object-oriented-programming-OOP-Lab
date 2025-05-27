package com.company;

public class Employee {
    public static String CompanyName;
    public String name;
    public float salary;

    public void insertvalue(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Company name ="+CompanyName);
        System.out.println("Name ="+name);
        System.out.println("Salary ="+salary+"\n");
    }
    public Employee(){
        this.name="default";
        this.salary=0000f;
    }
    public Employee(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    public Employee(String name){
        this.name=name;
        this.salary=00f;
    }
}
