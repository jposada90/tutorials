package springtutorial.example00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 */
public class TallerMecanico 
{
	
	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext00.xml");
		
		Coche coche1 =  (Coche) applicationContext.getBean("coche");
		Mecanico mecanico = (Mecanico) applicationContext.getBean("mecanico");
		
		coche1.setId(1);
				
		mecanico.reparar(coche1,coche1.getId());
		
		Coche coche2 =  (Coche) applicationContext.getBean("coche");
		coche2.setId(2);
		
		mecanico.reparar(coche2,coche2.getId());
	}
	
}