class JavaArray {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // For each
        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional Arrays
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}