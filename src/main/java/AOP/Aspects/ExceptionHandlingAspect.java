package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAspect(){
        System.out.println("beforeGetExceptionHandlingAspect:" +
                " Ловим/обробляємо виключення" +
                " при спробі отримання книги/журналу");
        System.out.println("--------------------------------------");

    }
}
