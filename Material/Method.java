package Material;

public class Method {
    public static void main(String[] args) {
        addition(5, 10);

        System.out.println("10 - 5 is " + subtraction(10, 5));
    }

    // A function that has a blueprint for all additions
    public static void addition(int a, int b) {
        System.out.println(a + b);
    } 

    // A function that has a blueprint for subtraction
    private static int subtraction(int a, int b) {
        return a - b;
    }
}

