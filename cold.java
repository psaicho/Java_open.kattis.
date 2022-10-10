import java.util.Scanner;

public class cold {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int items = scan.nextInt();
        scan.nextLine();
        int sum = 0;
        for(int i=0; i<items; i++){
            if (scan.nextInt()<0){
                sum+= 1;
            }
         }
        scan.close();
        System.out.println(sum);
    }
}
