import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final String department;
    private final double salary;

    public Employee(String name, String surname, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return employee.getName() == this.getName() && employee.getSurname() == this.getSurname();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
