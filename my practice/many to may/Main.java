//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /*Student S1 =new Student("Tilok",690);
     StudentIdCard card1=new StudentIdCard(241,S1);

     card1.displayCardinfo(); */

     Teacher t1=new Teacher("Tilok paul","Cse");
     Teacher t2=new Teacher("Arati paul","All");

     Student s1=new Student("Rimon",604);
     Student s2=new Student("Humaira",728);

     t1.addStudent(s1);
     t1.addStudent(s2);

     s1.addTeacher(t1);
     s1.addTeacher(t2);

     s1.displayStudentInfo();
     t1.displayTeacherinfo();


    }
}