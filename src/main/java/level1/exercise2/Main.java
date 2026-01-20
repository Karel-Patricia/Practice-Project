package level1.exercise2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", "García", 30);
        String text = "Welcome";
        int number = 100;

        GenericMethods.printElements(person, text, number);
        System.out.println("----");     

        GenericMethods.printElements(number, person, text);
        System.out.println("----");

        GenericMethods.printElements(text, number, person);
    }
}
