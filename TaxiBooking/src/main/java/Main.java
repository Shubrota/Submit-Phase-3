import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// Constructor Injection Demo
		Ride p1 = (Ride) context.getBean("Ride1");

		System.out.println("Product p1's name is " + p1.getFrom());
		System.out.println("Product p1's price is " + p1.getFare());
		
		// Setter Injection Demo
		Ride p2 = (Ride) context.getBean("Ride2");

		System.out.println();
		System.out.println("Product p2's name is " + p2.getFrom());
		System.out.println("Product p2's price is " + p2.getFare());
		
		
		((ClassPathXmlApplicationContext) context).close();


	}

}
