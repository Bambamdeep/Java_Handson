package seralizationDemo;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // it is unique identifier 
	int id ;
	String name ;
	transient String password;
	
	public Student(int id, String name,String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	void display() {
		System.out.println(" Id :- " + id+"\n" + " name:- " + name+"\n" + " password:- "+ password);
	}

}
