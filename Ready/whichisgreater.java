import java.util.*;

public class whichisgreater {
     
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        if ( x > y){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

}

/* 
StringBuilder inputX = new StringBuilder();
inputX.append(x);
inputX.reverse();
StringBuilder inputY = new StringBuilder();
inputY.append(y);
inputY.reverse();
*/
     