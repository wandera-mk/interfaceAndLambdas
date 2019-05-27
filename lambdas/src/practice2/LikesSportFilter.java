package practice2;

import java.util.function.Predicate;

import dto.Employee;

public class LikesSportFilter implements Predicate<Employee> {

	@Override
	public boolean test(Employee e) {
		return e.getHobby().contains("Sport");
	}
}
