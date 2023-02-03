public class patt2 {
    public static void main(String[] args) {
        int size = 5; //length of pattern is 5 only, the below part is the upside down
        int alpha = 65; //ASCII code for first capital letter
        int num = 0; //will increment alpha as char progresses
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" "); //top half until the spaces need to be printed
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char)(alpha + num++));//top half until the char need to
            }
            num = 0;
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) { //bottom half
                System.out.print(" ");
            }
            for (int k = (size - i) * 2 - 1; k > 0; k--) {
                System.out.print((char)(alpha + num++));
            }
            num = 0;
            System.out.println();
        }
    }
}