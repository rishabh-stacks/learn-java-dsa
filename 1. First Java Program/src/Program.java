import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        // int Input Program
        System.out.println("Enter Integer");
        int Integer = input.nextInt();
        System.out.println("Integer is " +Integer);

        // string Input Program
        System.out.println("Enter String");
        String name = input.nextLine();
        System.out.println("String is " +name);

        // float Input Program
        System.out.println("Enter Decimal");
        float Marks = input.nextFloat();
        System.out.println("Decimal is " +Marks);
    }

}
