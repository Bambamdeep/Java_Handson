package accessModifiers;

public class Student {
	private int id;
	private String name;
	private int standard;
	private String phoneNumber;

	public Student() {
		// default constructor
		this(0,null,10,null);
	}
//Constructor Chaining
public Student (int id,String name) {
	this(id,name,2,null);
}
	// Parametrize constructor;
	public Student(int id, String name, int standard, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.phoneNumber = phoneNumber;
	}
	
	
	/*
	//Constructor Overloading
	public Student(int sId) {
		id = sId;
	}
	public Student(int sId,String fullName) {
		id = sId;
		name = fullName;
	}
	public Student (int sId,String fullName,int grade) {
		id = sId;
		name= fullName;
		standard = grade;
	}
*/
	// Encapulation
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getStandard() {
		return standard;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", phoneNumber=" + phoneNumber + "]";
	}
	
}

