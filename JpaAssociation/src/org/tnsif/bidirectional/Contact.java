package org.tnsif.bidirectional;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Contact")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private Long Contactno;
	private String Simtype;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Person>person=new HashSet<Person>(0);
	public Long getContactno() {
		return Contactno;
	}
	public void setContactno(Long contactno) {
		Contactno = contactno;
	}
	public String getSimtype() {
		return Simtype;
	}
	public void setSimtype(String simtype) {
		Simtype = simtype;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long contactno, String simtype) {
		super();
		Contactno = contactno;
		Simtype = simtype;
		
	}
	public Set<Person> getPerson() {
		return person;
	}
	public void setPerson(Set<Person> person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Contact [Contactno=" + Contactno + ", Simtype=" + Simtype + ", person=" + person + "]";
	}
	
	

}
