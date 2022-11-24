package SpringFM2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFM2/config.xml");
		Printable p = (Printable) context.getBean("p");
		p.print();
	}
}