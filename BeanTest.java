package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		Address adr = (Address) context.getBean("ad");
		System.out.println(adr);

	}

}
