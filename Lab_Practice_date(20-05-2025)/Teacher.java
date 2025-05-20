package com.company;

public class Teacher {
    String name;
    int Salary;

    void display(){
        System.out.println("Name is :"+this.name+" Salary is :"+this.Salary);
    }

    void setValue(String name,int Salary){
        this.name = name;
        this.Salary=Salary;

    }

    int getSalary(){
        return this.Salary;
    }
}
