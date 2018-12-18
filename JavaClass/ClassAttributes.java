public class ClassAttributes {
    public static void main(String[] args) {
        HelperClass myObj1 = new HelperClass(); // Object 1
        HelperClass myObj2 = new HelperClass(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Outputs 10
        System.out.println(myObj2.x); // Outputs 25

        // Multiple Attributes
        HelperClass myObj = new HelperClass();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }
}