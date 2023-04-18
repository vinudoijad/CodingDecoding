/*Create Employee class (id,name,department) create Department 
class(departId,depart name) create Hashmap and put diff employee id as key and employee obj 
as value and sort by departId*/

package com.hashmapObj;

public class Employee {

	int id;
	String name = "name";
	String department = "department";
	
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	

}
