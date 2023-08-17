package AOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAndLoggingAdvice() {
//        System.out.println("beforeGetStudentsAndLoggingAdvice: логуємо отримання "
//                + "списку студентів перед методом getStudents");
//    }



    //    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsAndLoggingAdvice(List<Student> students){
//            Student firstStudent = students.get(0);
//
//            String nameSurname = firstStudent.getNameSurname();
//            nameSurname = "Mr. " + nameSurname;
//            firstStudent.setNameSurname(nameSurname);
//
//            double avaregeGrade = firstStudent.getAverageGrade();
//            avaregeGrade = avaregeGrade + 2;
//            firstStudent.setAverageGrade(avaregeGrade);
//
//            int course = firstStudent.getCourse();
//            course =+ 1;
//            firstStudent.setCourse(course);
//
//        System.out.println("afterReturningGetStudentsAndLoggingAdvice: логуємо отримання "
//        + "списка студентов після роботи метода getStudents");
//    }




//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentsAndLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsAndLoggingAdvice: логуємо виброс " +
//                "виключення " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsAndLoggingAdvice(){
        System.out.println("afterGetStudentsAndLoggingAdvice: логуваємо нормальне закінчення роботи метода або " +
                "викид виключення");
    }
}
