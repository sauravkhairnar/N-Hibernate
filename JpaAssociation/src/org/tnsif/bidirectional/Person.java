package org.tnsif.bidirectional;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="Person")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer addharno;
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Set<Person>person;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contactNO")
	private Contact contact;


	public Integer getAddharno() {
		return addharno;
	}


	public void setAddharno(Integer addharno) {
		this.addharno = addharno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(Integer addharno, String name, Contact contact) {
		super();
		this.addharno = addharno;
		this.name = name;
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Person [addharno=" + addharno + ", name=" + name + ", contact=" + contact + "]";
	}
	

}
