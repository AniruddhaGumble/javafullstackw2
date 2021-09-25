import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.eg.Employee;  
  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("applicationContext1.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Employee e=(Employee)factory.getBean("obj");  
   System.out.println(e.toString());
}  
}