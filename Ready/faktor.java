import java.util.Scanner;

public class faktor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        System.out.println(x * (y-1)+1);
    }
}
