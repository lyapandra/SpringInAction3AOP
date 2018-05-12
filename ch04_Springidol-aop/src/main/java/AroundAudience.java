import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAudience {
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("watchPerformance before01 The audience is taking their seats.");
            System.out.println("watchPerformance before02 The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("watchPerformance after01 CLAP");
            System.out.println("watchPerformance after-returning01 The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("after-throwing01 Boo! We want our money back!");
        }
    }
}
