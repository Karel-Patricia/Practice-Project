package level1.exercise1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods obj1 = new NoGenericMethods("First", "Second", "Third");
        System.out.println("Obj 1:");
        obj1.displayValues();

        NoGenericMethods obj2 = new NoGenericMethods("Third", "First", "Second");
        System.out.println("Obj 2:");
        obj2.displayValues();

    }
}
