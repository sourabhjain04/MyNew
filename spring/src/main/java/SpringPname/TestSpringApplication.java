package SpringPname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringPname.Employee;
import org.springframework.beans.factory.BeanCreationException;

public class TestSpringApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//String configFile = "SpringPname/config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringPname/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}
}