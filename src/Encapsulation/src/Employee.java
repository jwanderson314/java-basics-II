public class Employee extends Person{
    private int salary;
    Employee(String firstName, String lastName, Byte age, Integer ssn, int salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }
}
