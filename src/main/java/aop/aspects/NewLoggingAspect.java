package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: v bibl-ku" +
                "pytayutsya vernut' knigu");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: iskluchenie " + e + "bylo zalogirovano");
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: v bibl-ku" +
                "uspeshno vernuli knigu");

        return targetMethodResult;
    }
}
