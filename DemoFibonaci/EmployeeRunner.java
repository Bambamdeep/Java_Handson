package DemoFibonaci;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee employee = new Employee(4, "Narendra", "manager", 61000);
		List<Employee> listOfEmployee = List.of(new Employee(1, "Deepak", "boomi", 35000),
				new Employee(2, "Sujal", "B2B", 34000), new Employee(3, "deepak", "cni", 30000));

		listOfEmployee.forEach(System.out::println);
		System.out.println("byname");
		listOfEmployee.stream().filter(e -> e.getName().toLowerCase().startsWith("d")).collect(Collectors.toList())
				.forEach(System.out::println);
		;
		System.out.println("Salary");
		listOfEmployee.stream()
				.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed()).skip(1)
				.forEach(System.out::println);
		listOfEmployee.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		;
	}

}
