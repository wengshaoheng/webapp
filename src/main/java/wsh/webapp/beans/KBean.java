package wsh.webapp.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KBean {
	
	public KBean() {
		System.out.println("Kbean ..................");
	}
	
	@Pointcut("execution(* wsh.webapp.service.*.*(..))")
	public void handle() {
		System.out.println("KBean.handle...");
	}
	
	@Before("execution(* wsh.webapp.service.*.*(..))")
	public void doBefore(JoinPoint jp) {
		System.out.println("doBefore xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + jp.getKind());
		System.out.println("doBefore xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + jp.toLongString());
	}
	
	@After("execution(* wsh.webapp.service.*.*(..))")
	public void doAfter() {
		System.out.println("doAfter xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
	
//	@Around("execution(* wsh.webapp.service.*.*(..))")
//	public void doAround() {
//		System.out.println("doAround xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//	}
}
