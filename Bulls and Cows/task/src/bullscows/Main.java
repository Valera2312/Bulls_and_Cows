package bullscows;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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
        String Secret = GetRandom(length);
        int i = 1;
        while(true)
        {
            String m = NumberOfCowsAndBulls(Secret);
            System.out.println("Turn :" + i);

            if (!m.equals("Grade: " + length + " bulls.")) {
                System.out.println(m);
                i++;
            } else {
                System.out.println(m);
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
        }
    }

    public static String NumberOfCowsAndBulls(String SecretCode){
        Scanner scanner = new Scanner(System.in);
        String Try = scanner.nextLine();
        char[] charsFromTry = Try.toCharArray();
        char[] charsFromSecretCode = SecretCode.toCharArray();
        int bulls = 0;
        int cows = 0;
        for(int i = 0; i < charsFromTry.length; i++){

            if(charsFromTry[i]==charsFromSecretCode[i]){
                bulls++;
            }
            if(SecretCode.contains(String.valueOf(charsFromTry[i]))){
                cows++;
            }
        }
        cows = cows - bulls;

        if(bulls==0){
            return (cows > 1) ? "Grade: "+cows+" cows" : "Grade: "+cows+ " cow.";
        }else if(cows==0){
            return  (bulls > 1) ? "Grade: "+bulls+" bulls." : "Grade: "+bulls+ " bull.";
        }else{
            if(bulls > 1 && cows >1){
                return "Grade: "+bulls+" bulls and " + cows + " cows";
            }else if(bulls > 1 && cows == 1){
                return "Grade: "+bulls+" bulls and " + cows + " cow";
            }else{
                return "Grade: "+bulls+" bull and " + cows + " cow";
            }

        }
    }
    public static String GetRandom(int length){
        Scanner scanner = new Scanner(System.in);
        long pseudoRandomNumber = System.nanoTime()*2;
        StringBuilder s =  new StringBuilder();
        boolean repeatedChar = false;

        String random = new String(String.valueOf(pseudoRandomNumber));

        Set<Character> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < random.length(); i++) {
            linkedHashSet.add(random.charAt(i));
        }

        for (Character c : linkedHashSet) {
            s.append(c);
        }
        return s.substring(0,length);

    }

}
