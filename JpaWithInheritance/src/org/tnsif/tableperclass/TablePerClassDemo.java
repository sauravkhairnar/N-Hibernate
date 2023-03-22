//driver class
package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee e1=new Employee();
		e1.setId(121);
		e1.setName("Saurav Khairnar");
		e1.setSalary(25000.50f);
		em.persist(e1);
		
		//second emp
		Employee e11=new Employee();
		e11.setId(122);
		e11.setName("Gauri Kolhe");
		e11.setSalary(45000.50f);
		em.persist(e11);
		
		//first Manager
		Manager m=new Manager();
		m.setId(125);
		m.setName("Pratik More");
		m.setSalary(52000.45f);
		m.setDept_id(45);
		m.setDeptname("Finance");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}