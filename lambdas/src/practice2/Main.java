package practice2;

import java.util.ArrayList;
import java.util.List;

import dto.Employee;

public class Main {

	/**
	 * Remove those classes and use lambda expressions instead!
	 */
	public static void main(String[] args) {

		List<Employee> leads = new ArrayList<>();
		leads.add(new Employee("Dusan", 32, "Computers - Merge bans"));
		leads.add(new Employee("Ondrej", 29, "Sport - Climbing"));
		leads.add(new Employee("JiriS", 31, "Computers - Kubernetes"));
		leads.add(new Employee("MartinJ", 29, "Computers - Java"));
		leads.add(new Employee("MartinU", 31, "Sport - Climbing"));
		leads.add(new Employee("Radek", 40, "Sport - Running"));




		//TODO: Remove these objects
		Mapper mapper = new Mapper();
		LikesSportFilter likesSportFilter = new LikesSportFilter();

		//TODO: Rewrite using lambdas
		leads.stream().filter(likesSportFilter).map(mapper).forEach(System.out::println);

	}
}
