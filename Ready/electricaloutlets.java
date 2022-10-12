import java.util.*;
public class electricaloutlets{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for (int i=1; i<= sc.nextInt(); i++){
int s = 1;
int T = sc.nextInt();
for (int a=1; a<= T; a++){
    s += sc.nextInt()-1;
}
System.out.println(s);
sc.close();
}
}
}

