package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();

		
		//First Employee
		
		Employee emp1=new Employee();
		emp1.setEmpname("Vaibhav");
		
		//Second Employee
		
		Employee emp2=new Employee();
		emp2.setEmpname("Saurav");
		
		//First Address
		
		Address a1=new Address();
		a1.setPincode(413710);
		a1.setArea("GaneshPeth");
		a1.setCity("Nagapur");
		a1.setState("Maharashtra");
		
		//First Address
		
		Address a2=new Address();
		a2.setPincode(422008);
		a2.setArea("Airoli");
		a2.setCity("Mumbai");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
	
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		System.out.println("Data Added Successfully");
		em.close();
		
		factory.close();
		
	
	}

}
