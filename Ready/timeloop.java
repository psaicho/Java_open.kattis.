import java.util.Scanner;

public class timeloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        for (int i = 1; i < (input+1); i++){
            System.out.println(i + " Abracadabra");
        }
    }

}
