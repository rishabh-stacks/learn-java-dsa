import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Printing Integer input
        System.out.println(input.nextInt());

        // Printing String input
        System.out.println(input.next());

        //Printing String full-line
        System.out.println(input.nextLine());
    }
}