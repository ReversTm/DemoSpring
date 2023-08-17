package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        System.out.println("Method main starts");
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(MyConfig.class);
//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        String bookName = uniLibrary.returnBook();
//        System.out.println("У бібліотеку повернули книгу "+ bookName);
//
//        context.close();
//        System.out.println("Method main ends");

        try  {
            throw  new RuntimeException();
        }
        catch (Exception e){
            System.out.println("Виключення!");
        }
        finally {
            System.out.println("Finally!!!");
        }
    }
}
