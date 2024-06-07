public class Main {


    public static Family createObject(String className) {
        switch (className) {
            case "Father":
                Father father = new Father(40, "John", 5000);
                return father;
            case "Mother":
                Mother mother = new Mother(36, "Alice", "Housewife");
                return mother;
            case "Son":
                Son son = new Son(17, "Alex", 10);
                return son;
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);

        }

    }


    public static void main(String[] args) {
        Family father = createObject("Father");
        Family mother = createObject("Mother");
        Family son = createObject("Son");

        Family[] families = {father, mother, son};

        for (int i = 0; i < families.length; i++) {
            if (families[i] instanceof Printable) {
                ((Printable) families[i]).print();
            }
        }
    }
}
