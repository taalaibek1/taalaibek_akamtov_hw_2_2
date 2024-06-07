public class Son extends Family implements Printable {
    private int grade;

    public Son(int age, String name, int grade) {
        super(age, name);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println( "Name: " + getName() +" Age: " + getAge() + " Grade at school: " + grade);

    }
}
