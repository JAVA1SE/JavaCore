public class Looping {
    public static void main(String[] args) {
        // While
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // The Do/While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // For loop
        for (int k = 0; k <= 10; k = k + 2) {
            System.out.println(k);
        }

        // For-Each Loop
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String l : cars) {
            System.out.println(l);
        }

    }
}