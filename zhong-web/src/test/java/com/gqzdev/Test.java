package com.gqzdev;

import com.gqzdev.service.TestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * @ClassName Test
 * @Description
 * @Author ganquanzhong
 * @Date2020/7/7 23:07
 * @Version
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {

	@Autowired
	TestService testService;

	@org.junit.Test
	public void test(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//		String[] names = applicationContext.getBeanDefinitionNames();
//		String[] beanNamesForType = applicationContext.getBeanNamesForType(Object.class);
//		Arrays.asList(beanNamesForType).forEach(team -> System.out.println(team));
//		Arrays.asList(names).forEach(System.out::println);

		//TestService testService = (TestService) applicationContext.getBean("testService");
		System.out.println(testService);
		testService.add();

		System.out.println("整合其他第三方组件！");
	}
}
