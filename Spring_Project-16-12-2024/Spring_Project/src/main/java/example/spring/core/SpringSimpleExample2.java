package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringSimpleExample2 {

	public static void main(String[] args) {
		/* This program obtains the bean against its ID from Spring's 
		 * configuration unit and invokes its method. 
		 */
		ApplicationContext context;
		String fileName = "spring-config.xml";
		context = new ClassPathXmlApplicationContext(fileName);
		Object loadedObject = context.getBean("myBean");
		GreetingService gs = (GreetingService)loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}






