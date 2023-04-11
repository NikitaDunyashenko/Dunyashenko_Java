import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number > 7) {
                System.out.println("Hello");
            } else {
                System.out.println("GoodBye");
            }
        } else if (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println("You entered text " + text);
        }
        sc.close();
    }
}
