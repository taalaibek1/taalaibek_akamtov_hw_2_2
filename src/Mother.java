public class Mother extends Family  implements Printable{
    private String position;

    public Mother(int age, String name, String position) {
        super(age, name);
        this.position=position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println( "Name: " + getName() +" Age: " + getAge() + " Position: " + position);

    }
}
