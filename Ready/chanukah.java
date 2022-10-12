import java.util.*;

public class chanukah {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;  i <= N; i++){
            sc.nextInt();
            int b = sc.nextInt();
            int wynik = ((b+2)*(b+1)) /2 - 1;
            System.out.println(i+ " " +wynik);
        }
        sc.close();
    }
}
