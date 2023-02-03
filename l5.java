import java.util.Scanner;
public class l5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " "); //only those bulbs will remain on which are perfect square roots
        }
    }
}
