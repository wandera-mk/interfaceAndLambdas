package practice1;

import java.util.function.Predicate;

import dto.Employee;

public class AgeFilterOlderThan30 implements Predicate<Employee> {

	@Override public boolean test(Employee e) {
		return e.getAge() > 30;
	}
}
