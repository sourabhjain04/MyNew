package SpringFm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFm/config.xml");
		A a = (A) context.getBean("a");
		a.msg();
	}
}