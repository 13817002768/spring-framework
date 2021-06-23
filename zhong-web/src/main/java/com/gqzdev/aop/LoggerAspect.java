package com.gqzdev.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // 声明此类为一个切面
@Component
public class LoggerAspect {

	@Pointcut("execution(public * com.gqzdev.service..*.add(..))")
	public void myMethod(){};

	@Before("myMethod()")
	public void before(){
		System.out.println("method before");
	}

	@After("myMethod()")
	public void after(){
		System.out.println("method after");
	}

	@AfterReturning("execution(public * com.gqzdev.service..*.*(..))")
	public void afterReturning(){
		System.out.println("afterReturning");
	}

	@AfterThrowing("execution(public * com.gqzdev.service..*.*(..))")
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}
}
