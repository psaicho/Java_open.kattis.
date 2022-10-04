import java.util.Scanner;

public class findingana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        int x = input.indexOf("a");
        System.out.println(input.substring(x,input.length()));
    }
}