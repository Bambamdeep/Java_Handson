package methodArgument;

class Student {
	int id;
	String name;

	/*
	 * Student (int id , String name){ this.id = id; this.name = name; }
	 */
	// passing object as method Argument.
	public void display(Student student) {
		System.out.println("Id: " + student.id);
		System.out.println("String : " + student.name);

	
	}
	void changeDetails(Student student1) {
		student1.name = "Deepak kumar1";
	}
	// returning object from method
	 Student getStudent() {
		 Student s = new Student();
		 s.id = 22;
		 s.name = "Bambam Bhardwaj";
		return s;
		 
	 }
		public static void main(String[] args) {
		// Student student = new Student(1,"Deepak kumar");
		Student student = new Student();
		student.id = 10;
		student.name = "Kumar Deepak";
	//	student.changeDetails(student);
		student.display(student);
		// not working 
		// System.out.println(student.getStudent().toString());
		Student student1 = student.getStudent();
		System.out.println(student1.id);
		
	}

}
