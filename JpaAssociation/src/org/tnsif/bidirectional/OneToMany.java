package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		
		//Person 1
		Person p=new Person();
		p.setAddharno(4652558);
		p.setName("Narendra Modi");
		
		//Person 2
		
		Person p1=new Person();
		p1.setAddharno(46654);
		p1.setName("Smurti Irani");
		
		//Contact 1
		Contact c1= new Contact();
		c1.setContactno(78786744L);
		c1.setSimtype("Prepaid");
		
		//contact 2
		
		Contact c2= new Contact();
		c2.setContactno(5646464648L);
		c2.setSimtype("Postpaid");
		
		p.setContact(c2);
		p.setContact(c1);
		
		em.persist(c2);
		em.persist(c1);
		
		em.getTransaction().commit();
		
		System.out.println("Data Added Successfully");
		em.close();
		
		factory.close();
		
		
	}

}
