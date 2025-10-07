package inheritanceDemo;
 class Person {
	public int id;
    public String name;
    
    Person (int id,String name){
    	super();
    	this.id =  id;
    	this.name = name;	
    }
    public void setId (int id) {
    	this.id = id;
    }
    public int getId() {
    	return id ;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
    public String toString () {
    	return "Person[id:"+ id +",name: "+ name +"]";
    }
}
class Employee extends Person{
     private String department;
     private int salary;
	Employee(int id, String name,String department,int salary) {
		super(id, name);
		this.department = department;
		this.salary = salary;
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [id= "+ id +",name="+ name + ", department=" + department + ", salary=" + salary + "]";
	}
	public static void main(String [] args) {
		Employee emp = new Employee(1,"deepak","eps",50000);
		System.out.println(emp);
		Person person = new Person(1,"deepak");
  	System.out.println(person);
	}
	
}