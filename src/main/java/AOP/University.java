package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudents(){
        Student st1 = new Student("Yehor Motorniy", 4,
                6.0);
        Student st2 = new Student("Anna Deineko", 3,
                8.0);
        Student st3 = new Student("Polina Zidko", 3,
                5.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Початок роботи метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }

}
