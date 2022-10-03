import  java.util.*;

class tafifa{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), n = scan.nextInt();
        int availableMegabytes = x*(n+1);
        for (int i = 0; i < n; i++){
            availableMegabytes -= scan.nextInt();
        }
        System.out.println(availableMegabytes);
    }
}

