package springtutorial.innerBeans;

import org.springframework.context.ApplicationContext;
//First inheritance example
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
     
	   //First inheritance example
	   // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");
	   
	   //Example with annotation
	   ApplicationContext context = 
			   new AnnotationConfigApplicationContext(TextEditorConfig.class);
      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}