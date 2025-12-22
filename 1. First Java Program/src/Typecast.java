public class Typecast {
    public static void main(String[] args) {

        // Type-Promotion
        int a = 257;
        byte b = (byte) a;
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println(f);

        // Example
        byte g = 42;
        char h = 'a';
        short i = 1024;
        int j = 5000;
        float k = 5.67f;
        double l = 0.12345;

        double result = (k*l) + (j/h) + (l*i);   // double = float + int + double

        System.out.println((k*l) + " " + (j/h) + " " + (l*i));
        System.out.println(result);
    }
}
