package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Manager_store")
@Entity
public class Manager extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer dept_id;
	private String deptname;
	
	//Getter And Setter
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
