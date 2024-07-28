import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// Constructor Injection Demo
		Ride p1 = (Ride) context.getBean("Ride1");

		
		
		// Setter Injection Demo
		Ride p2 = (Ride) context.getBean("Ride2");

		
		
		
		((ClassPathXmlApplicationContext) context).close();


	}

}
