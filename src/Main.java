// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Creating a new Person object
        Person person1 = new Person("Alice", 30);

        // Using the methods of the Person class
        person1.displayInfo();

        // Changing the name and age using setters
        person1.setName("Bob");
        person1.setAge(40);

        // Display updated info
        person1.displayInfo();
    }
}
