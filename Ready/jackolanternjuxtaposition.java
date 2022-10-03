import java.util.Scanner;

public class jackolanternjuxtaposition{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        scan.close();
        int wynik = 1;
        for (int i = 0; i < input.length; i++){
            wynik *= Integer.parseInt(input[i]);
        }
        System.out.println(wynik);
    }
}
