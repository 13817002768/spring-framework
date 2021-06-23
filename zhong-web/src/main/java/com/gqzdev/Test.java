package com.gqzdev;

import com.gqzdev.config.WebConfig;
import com.gqzdev.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;

/**
 * description:
 * @Date： 2020/7/7 22:58
 */
public class Test {
	public static void main(String[] args) {

//		ApplicationContext ac = new AnnotationConfigApplicationContext(WebConfig.class);
//		String[] names = ac.getBeanDefinitionNames();
//		for (String name: names){
//			System.out.println(name);
//		}

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WebConfig.class);


		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//		String[] names = applicationContext.getBeanDefinitionNames();
//		String[] beanNamesForType = applicationContext.getBeanNamesForType(Object.class);
//		Arrays.asList(beanNamesForType).forEach(team -> System.out.println(team));
//		Arrays.asList(names).forEach(System.out::println);
		Object testService = applicationContext.getBean("testService");
		System.out.println(testService);

	}
}
