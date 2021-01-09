import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        int x = 0;
        if(number>0){
            x = 1;
        }else if (number<0){
            x = -1;
        }else{
            x = 0;
        }
        return x;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}