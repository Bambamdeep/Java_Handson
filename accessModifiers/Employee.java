package accessModifiers;

public class Employee {
	
	private int id;
	private String name;
	private String department;
    private static String comapnyName = "XYZ pvt Limited";
	public Employee(int id, String name, String department) {
		super();
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
	public static String getComapnyName() {
		return comapnyName;
	}
	public static void setComapnyName(String comapnyName) {
		Employee.comapnyName = comapnyName;
	}
	public void display() {
		System.out.println( id);
		System.out.println( name);
		System.out.println(department);
		System.out.println(comapnyName);
	}
    
	

}
