public class HelperClass {
    int x = 10;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    int modelYear;
    String modelName;

    public HelperClass(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

}