package collectionDemo;

class Student<T, u> {
	T id;
	u Name;

	public Student(T id, u name) {
		super();
		this.id = id;
		Name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public u getName() {
		return Name;
	}

	public void setName(u name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}

}
