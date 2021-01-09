
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char[] charsFromString = number.toCharArray();
        int o = 0;
        for(int i =charsFromString.length-1;i>=0;i--){
            if(charsFromString[i]=='0'&&i!=1){
                o++;
                continue;
            }

            System.out.print(charsFromString[i]);

        }
        if(o>2){
            System.out.print("0");
        }

    }

}
