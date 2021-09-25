//import org.jboss.weld.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
import org.springframework.context.ApplicationContext;
  
public class Test {  
    public static void main(String[] args) {  
          
        //Resource r=new ClassPathResource("applicationContext2.xml");  
        //BeanFactory factory=new XmlBeanFactory(r);  
        ApplicationContext context = 
             new ClassPathXmlApplicationContext("applicationContext2.xml");
        Employee s=(Employee)context.getBean("e"); 
        Address adr=(Address)context.getBean("a1");
        Department dp=(Department)context.getBean("d1");
        s.show();  
        
        
       // Address adr=(Address)context.getBean("a1");
        System.out.println(adr);
        System.out.println(dp);
    }  
}