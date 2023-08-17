package AOP.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAdvice
            (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvice: " +
                "намагаються повернути книгу");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("aroundReturningBookLoggingAdvice: " +
                    "було піймано виключення " + e);
            throw e;
        }

        System.out.println("aroundReturningBookLoggingAdvice: " +
                "у бібліотеку успішно повернули книгу");

        return targetMethodResult;
    }
}
