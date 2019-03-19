package hospitalAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		User user = context.getBean("patient", User.class);
		Patient patient = (Patient) user;
		
		patient.setId(001);
		patient.setName("Fasma");
		patient.setEmail("marde@gmail.com");
		patient.setNohp("089615125347");
		
		System.out.println("profile");
		System.out.println(patient.toString());
		System.out.println("Surgery Details : " + patient.getSurgery().details());
		System.out.println("Surgery Price : Rp " + patient.getSurgery().price());
		
		context.close();
	}
}
