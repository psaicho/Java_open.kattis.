import java.util.Scanner;

public class triarea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        double result = (((float)x * y) / 2);
        scan.close();
        String str_res = String.format("%2.02f", result);
        System.out.println(str_res);
    } 
}
