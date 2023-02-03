import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1; //initialize with 1 as factorial of 0 and 1 both is 1
        for (int i = 2; i <= n; i++) {
            ans *= i; //keep multiplying numbers in the current product till you reach n
        }
        System.out.println(ans);
    }
}