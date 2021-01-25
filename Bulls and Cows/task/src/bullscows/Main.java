package bullscows;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");

        int length = scanner.nextInt();
        if(length>=9){
            System.out.println("Error: can't generate a secret number with " +
                    "a length of 11 because " +
                    "there aren't " +
                    "enough unique digits.");
            return;
        }
        System.out.println("Okay, let's start a game!");
        String Secret = String.valueOf(GetRandom(length));
        //System.out.println(Secret);
        int i = 1;
        while(true)
        {
            String m = NumberOfCowsAndBulls(Secret);
            System.out.println("Turn :" + i);
            if (m.equals("Grade: " + length + " bulls.")||m.equals("Grade: "+length+ " bull.")) {
                System.out.println(m);
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            } else {
                System.out.println(m);
                i++;
            }
        }
    }
    public static String NumberOfCowsAndBulls(String SecretCode) {
        Scanner scanner = new Scanner(System.in);
        String Try = scanner.nextLine();
        char[] charsFromTry = Try.toCharArray();
        char[] charsFromSecretCode = SecretCode.toCharArray();
        int bulls = 0;
        int cows = 0;

        if(SecretCode.length()==1){

            if(charsFromTry[0] == charsFromSecretCode[0]){
                bulls = 1;

            }

        }else {
            for (int i = 0;i < charsFromTry.length;i++) {

                if (charsFromTry[i] == charsFromSecretCode[i]) {
                    bulls++;
                    cows--;

                }
                if(SecretCode.contains(String.valueOf(charsFromTry[i]))){
                    cows++;

                }

            }
        }
        if(bulls==0){
            return (cows > 1) ? "Grade: "+cows+" cows" : "Grade: "+cows+ " cow.";
        }else if(cows==0){
            return  (bulls > 1) ? "Grade: "+bulls+" bulls." : "Grade: "+bulls+ " bull.";
        }else{
            if(bulls >= 1 && cows >1){
                return "Grade: "+bulls+" bulls and " + cows + " cows";
            }else if(bulls > 1 && cows == 1){
                return "Grade: "+bulls+" bulls and " + cows + " cow";
            }else{
                return "Grade: "+bulls+" bull and " + cows + " cow";
            }

        }
    }
    public static int GetRandom(int length){
        Random random = new Random();

        int upper = (int) Math.pow(10,length);
        int lower = upper/10;
        return random.nextInt(upper - lower) + lower;

    }

}