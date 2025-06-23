import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    String subject;
    List<Student>students;

    Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
        this.students=new ArrayList<>();
    }

    void addStudent(Student student){
        students.add(student);
    }

    void displayTeacherinfo(){
        System.out.println("Teacher :"+name);
        System.out.println("Subject :"+subject);
        System.out.println("Students :");
        for(Student s : students){
            System.out.println("-"+s.name);
            System.out.println(s.studentid);
        }
    }
}
