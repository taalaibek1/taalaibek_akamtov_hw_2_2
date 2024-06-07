public class Father extends Family implements Printable{
    private int salary;

    public Father(int age, String name, int salary) {
        super(age, name);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println( "Name: " + getName() +" Age: " + getAge() + " Salary: " + salary);

    }
}
