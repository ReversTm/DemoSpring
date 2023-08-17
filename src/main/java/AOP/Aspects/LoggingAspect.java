package AOP.Aspects;

import AOP.Book;
import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* AOP.UniLibrary.*(..))")
//    private void allMethondsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//
//    }
//
//    @Pointcut("allMethondsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }

//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    public void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    public void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//
//    }


    @Before("AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "
                + methodSignature);
        System.out.println("methodSignature.getMethod() = "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "
                + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            System.out.println(Arrays.toString(arguments));
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Інформація про книгу: " +
                            myBook.getName() + ", автор: "
                            + myBook.getAuthor() + ", рік написання: " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу у бібліотеку додає " + obj);
                }

            }
        }


        System.out.println("beforeGetBookAdvice: Логування " +
                "спроби отримати книги/журналу");
        System.out.println("--------------------------------------");
    }
}
