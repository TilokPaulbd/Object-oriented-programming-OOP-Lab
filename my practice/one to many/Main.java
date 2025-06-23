//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Student s1 =new Student("Tilok",690);
     StudentIdCard card1=new StudentIdCard(241,s1);

     card1.displayCardinfo();

     Teacher t1=new Teacher("Tilok paul","Cse");

     Student S1=new Student("Rimon",604);
     Student S2=new Student("Humaira",728);

     t1.addStudent(S1);
     t1.addStudent(S2);

     t1.displayTeacherinfo();

    }
}