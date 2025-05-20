package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

	 Student s1= new Student();
     s1.setValue("Tilok Paul",690,3.5f);
     s1.display();

     Student s2 = new Student();
     s2.name="Tilok paul";
     s2.id=690;
     s2.cgpa=3.6f;
     s2.display();

     System.out.println(s2.getCgpa());

     Teacher t1=new Teacher();
     System.out.println("Enter name :");
     t1.name=sc.nextLine();
     System.out.println("Enter Salary :");
     t1.Salary=sc.nextInt();

     t1.display();


     Circle c1 =new Circle();
     System.out.println("Enter Radius :");
     c1.radius=sc.nextFloat();
     System.out.println("Area is ="+c1.radius());

        int[] arr=new int[5];
        int sum =0;
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(i+1)+" Number :");
            arr[i]= sc.nextInt();
            sum +=arr[i];
        }
        System.out.println("Sum is = "+sum);


    }

}

