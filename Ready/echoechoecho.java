import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        System.out.println((input + " ").repeat(3));
    }
}