import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int studentid;
    List<Teacher>teachers;

    Student(String name,int studentid){
        this.name=name;
        this.studentid=studentid;
        this.teachers=new ArrayList<>();
    }

    void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    void displayStudentInfo(){
        System.out.println("Student :"+name);
        System.out.println("Teacher :");
        for (Teacher t:teachers){
            System.out.println("-"+t.name+"-"+t.subject);
        }
    }
}
