package example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {
    public static void main(String[] args) {
        /* This program obtains the bean against its ID from Spring's 
         * configuration unit and invokes its method. 
         */
        ApplicationContext context;
        String filePath = "./src/main/resources/spring-config.xml";
        context = new FileSystemXmlApplicationContext(filePath);
        Greeting_Service gs = (Greeting_Service) context.getBean("myBean");
        String reply = gs.greetings();
        System.out.println(reply);
    }
}
