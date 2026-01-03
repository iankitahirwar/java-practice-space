class Nested_if {
    public static void main(String args[])
    {
        int i = 10;

        if (i < 15) {
            System.out.println("i is smaller");

            // Nested if statement
            if (i == 10) {
                System.out.println("i is exactly 10");
            }
        }
    }
}