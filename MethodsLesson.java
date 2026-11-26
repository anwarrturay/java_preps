
public class MethodsLesson {
    // static means this method belongs to the class itself rather than an
    // individual object instance.
    static void greet() {
        System.out.println("Welcome to Java!");
    }

    // METHOD OVERLOADING
    // public static int add(int a, int b) {

    // int result = a + b;

    // return result;
    // }

    // static int add(int a, int b, int c) {
    // return a + b + c;
    // }

    // static double add(double a, double b) {
    // return a + b;
    // }

    // Methods returning an array.
    // static int[] getNumbers(){
    // int[] numbers = { 10, 20, 30, 40, 50};
    // return numbers;
    // }

    // JAVA PASS-BY-VALUE.
    static void changeValue(int number) {
        number = 100;
    }

    static void changeArray(int[] numbers) {
        numbers[0] = 100;
    }

    public static void main(String args[]) {
        // Methods in java are fascinating.
        greet();
        // int r1 = add(3, 5);
        // int r2 = add(17, 23, 20);
        // double r3 = add(23.9, 43.7);
        // System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(r3);

        // FIRST SAMPLE WITH PRIMITIVES.
        int age = 22;

        changeValue(age);

        System.out.println(age);

        // SECOND SAMPLE WITH ARRAYS.
        int[] values = { 10, 20, 30 };

        changeArray(values);

        System.out.println(values[0]);

    }
}
