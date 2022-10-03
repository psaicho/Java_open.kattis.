import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        if (Integer.parseInt(input.substring(0,3)) == 555){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
