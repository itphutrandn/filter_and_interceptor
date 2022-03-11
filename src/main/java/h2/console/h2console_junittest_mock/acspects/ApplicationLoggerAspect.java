package h2.console.h2console_junittest_mock.acspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ApplicationLoggerAspect {

    private final Logger logger = LoggerFactory.getLogger(ApplicationLoggerAspect.class);

    @AfterThrowing(pointcut="execution(* h2.console.h2console_junittest_mock.controllers.StudentController.getList(..))", throwing="ex")
    public void logAfterThrowing (JoinPoint joinPoint, Exception ex) {
        logger.error("Target Method resulted into exception, message {}", ex.getMessage());
    }

    //pointcut="com.xyz.myapp.SystemArchitecture.dataAccessOperation()",
//    @AfterReturning(pointcut="execution(* h2.console.h2console_junittest_mock.controllers.StudentController.getList(..))", returning = "retVal")
//    public void definePackagePointcuts (Object retVal) {
//        logger.debug("-----------------Before------------------");
//        System.out.println(retVal);
//    }

//    @Before("this(h2.console.h2console_junittest_mock.controllers.BaseControler)")
//    public void definePackagePointcuts (JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }

    // Have class
//    @Before("execution(* h2.console.h2console_junittest_mock.controllers.StudentController.*(..))")
//    public void definePackagePointcuts (JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }

    //  have return type
//    @Before("execution(String h2.console.h2console_junittest_mock.controllers.*.*(..))")
//    public void definePackagePointcuts (JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }

//    before any access modifier and return type
//    @Before("execution(* h2.console.h2console_junittest_mock.controllers.*.*(..))")
//    public void definePackagePointcuts (JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }

    // access modifier
//    @Before("execution(public * h2.console.h2console_junittest_mock.controllers.*.*(..))")
//    public void definePackagePointcuts (JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }

//    @After("execution(* h2.console.h2console_junittest_mock.controllers.*.add(..)) || execution(* h2.console.h2console_junittest_mock.controllers.*.edit(..))")
//    public void beforeExecution (JoinPoint joinPoint) {
//        logger.debug("-----------------After------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//    }
//    @Pointcut("within(h2.console.h2console_junittest_mock.controllers..*)")
//    public void definePackagePointcuts () {
//
//    }
//    @Before("definePackagePointcuts()")
//    public void jponicut(JoinPoint joinPoint) {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " +joinPoint.getSignature().getName()+ " -"+ Arrays.toString(joinPoint.getArgs()));
//    }
//
//    @After("definePackagePointcuts()")
//    public void afterLog(JoinPoint joinPoint) {
//        logger.debug("-----------------After------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " +joinPoint.getSignature().getName()+ " -"+ Arrays.toString(joinPoint.getArgs()));
//    }

//    @Around("definePackagePointcuts()")
//    public void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
//        logger.debug("-----------------Before------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " + joinPoint.getSignature().getName() + " -" + Arrays.toString(joinPoint.getArgs()));
//        joinPoint.proceed();
//        logger.debug("-----------------After------------------");
//        logger.debug(joinPoint.getSignature().getDeclaringTypeName() + " - " +joinPoint.getSignature().getName()+ " -"+ Arrays.toString(joinPoint.getArgs()));
//    }
}
