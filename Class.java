public class Class {
     int a = 2;

    // Default Constructor - No Use
    Class() {
        a = 3;
    }

    // Parameterized Constructor
    Class(int b) {
        a = b;
    }

    public static void main(String args[]) {

        // System.out.println(a); // 1
        Class cls = new Class(5);
        // int a = 5;
        System.out.println(cls.a); // 2

        // cls.a = 2;

    }
}
