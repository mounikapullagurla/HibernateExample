package mypackage;

import org.hibernate.*;  
import org.hibernate.cfg.*;  

public class StoreData {

	public static void main(String[] args) {


		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction(); 

		Employee e1=new Employee();  
		
		e1.setFirstName("satyamma");  
		e1.setLastName("pulla");  

	    RegularEmployee e2=new RegularEmployee();  
	    e2.setFirstName("mouna"); 
	    e2.setLastName("pulla");
	    e2.setSalary(50000);  
	    e2.setBonus(5);  
	      
	    ContractEmployee e3=new ContractEmployee();  
	    e3.setFirstName("Chotey"); 
	    e3.setLastName("pulla");
	    e3.setPay_per_hour(1000);  
	    e3.setContract_period("15 hours");
		session.persist(e1);//persisting the object  
		session.persist(e2);
		session.persist(e3);
System.out.println("successfully added");
		t.commit();//transaction is committed  
		session.close();  

		System.out.println("successfully saved");  

	}

}
