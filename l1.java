import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1; //initial 2 elements are 1 and 1
        int b = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int sum = a+b; //calculating every 3rd element in the series by summing up previous 2
            a = b; //update previous element to next element
            b = sum;//update b to newly created next element
        }
    }
}