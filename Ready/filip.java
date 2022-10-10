import java.util.*;

public class filip {
    public static int ReverseInt(int number)   
        {  
        int reverse = 0;  
        while(number != 0){  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  
        return reverse; 
    }  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        if ( ReverseInt(x) > ReverseInt(y)){
            System.out.println(ReverseInt(x));
        }
        else{
            System.out.println(ReverseInt(y));
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
     