public class StringTest {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = txt.length();
        System.out.println("The length of the txt string is: " + len);

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        // Finding a String in a String
        String txtFinding = "Please locate where 'locate' occurs!";
        System.out.println(txtFinding.indexOf("locate"));

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String x = "10";
        String y = "20";
        String z = x + y; // z will be 1020 (a String)
        System.out.print(z);

        

    }
}