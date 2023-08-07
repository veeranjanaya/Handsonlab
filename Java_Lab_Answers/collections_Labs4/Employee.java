package collections_Labs4;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee employees) {
        return Integer.compare(this.id, employees.id);
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            int nameComparison = emp1.name.compareTo(emp2.name);
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                int ageComparison = Integer.compare(emp1.age, emp2.age);
                if (ageComparison != 0) {
                    return ageComparison;
                } else {
                    return Integer.compare(emp1.salary, emp2.salary);
                }
            }
        }
    };

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            int salaryComparison = Integer.compare(emp1.salary, emp2.salary);
            if (salaryComparison != 0) {
                return salaryComparison;
            } else {
                int ageComparison = Integer.compare(emp1.age, emp2.age);
                if (ageComparison != 0) {
                    return ageComparison;
                } else {
                    return emp1.name.compareTo(emp2.name);
                }
            }
        }
    };
}
