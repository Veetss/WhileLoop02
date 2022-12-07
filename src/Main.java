import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a command: ");

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                System.out.println("Please enter a command: "
                        + scanner.nextInt());
            }

            else {
                System.out.println("Program stopped successfully." + scanner.nextLine());
                break;
            }
        }
    }
}