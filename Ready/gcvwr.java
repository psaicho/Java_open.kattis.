
import java.util.Scanner;

public class gcvwr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int G = scan.nextInt();
        int T = scan.nextInt();
        int N = scan.nextInt();
        scan.nextLine();
        int myArray[] = new int [N];
        int sum = 0;
        for(int i=0; i<N; i++){
            myArray[i] = scan.nextInt();
            sum = sum + myArray[i];
         }
        System.out.println((int) ((G- T)*0.9 - sum));
        scan.close();
    }
}

/*String input[] = scan.nextLine().split(" ");
        int[] numbers = new int[input.length]; 
          for(int i = 0; i < numbers.length; i++) {
             numbers[i] = Integer.parseInt( input[i] );
          }
        System.out.println(T); */
