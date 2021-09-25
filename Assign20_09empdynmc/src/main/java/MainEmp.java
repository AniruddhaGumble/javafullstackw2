import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		
		List<Employee> ep=new ArrayList<Employee>();
		ep.add(ctx.getBean(Employee.class,"Anirudha",12,51,"addr1"));
		ep.add(ctx.getBean(Employee.class,"Anirudha Gumble",111,1000,"addr2"));
		System.out.println("Employees are :- ");
		
		for (Employee emp: ep) {
			System.out.println(emp);
		}
	}
}
	
