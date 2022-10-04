

import java.util.*;

public class digitswap{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       String input = scan.nextLine();
       scan.close();
       StringBuilder input1 = new StringBuilder();
       input1.append(input);
       System.out.println(input1.reverse());
        
    }
}