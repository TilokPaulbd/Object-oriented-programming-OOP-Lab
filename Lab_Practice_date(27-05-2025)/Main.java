package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee.CompanyName="Tiloks Company";

        Employee emp1 =new Employee();

        emp1.insertvalue("Tilok",50000.0f);
        emp1.display();
        Employee emp2 =new Employee();
        emp2.display();
        Employee emp3=new Employee("Rishad",80000.0f);
        emp3.display();
        Employee emp4=new Employee("Humaira Akther Himu");
        emp4.display();

        Person p1= new Person();
        p1.setName("TILOK PAUL");
        p1.setAge(50);

        System.out.println("Name ="+p1.getName()+" Age ="+p1.getAge());

        Person p2= new Person();
        p2.setName("Rishad");
        p2.setAge(30);

        String PersonName=p2.getName();
        int PersonAge=p2.getAge();
        System.out.println("Name ="+PersonName+" Age="+PersonAge);
    }
}
