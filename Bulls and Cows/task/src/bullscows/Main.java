package bullscows;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String sizeString = scan.nextLine();
        if(!sizeString.matches("[-+]?\\d+")){

            System.out.println("Error: " + sizeString + " isn't a valid number.");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        int charSize = scan.nextInt();


            int size = Integer.parseInt(sizeString);
            if(size > charSize||size == 0 || charSize == 0){

                System.out.println("Error: it's not possible to generate a code with a length of "+ size +" with "+ charSize + " unique symbols.");
                return;
            }
            else if(charSize>36){
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                return;

            }
            char[] randomCode = generateRandomNum(size, charSize);
            System.out.println("Okay, let's start a game!");
            int count = 1;
            boolean isRight;
            do {
                System.out.println("Turn " + count + ":");
                count++;
                isRight = grade(randomCode);
            } while (!isRight);
            System.out.println("Congratulations! You guessed the secret code.");





    }

    public static char[] generateRandomNum(int size, int charSize) {
        char[] randomCode = new char[size];
        String charList = "0123456789abcdefghijklmnopqrstuvwxyz";
        List<Character> currentCharList = new ArrayList<>();
        for (int k = 0; k < charSize; k++) {
            currentCharList.add(charList.charAt(k));
        }
        Collections.shuffle(currentCharList);
        for (int j = 0; j < size; j++) {
            randomCode[j] = currentCharList.get(j);
        }
        StringBuilder prepearingMessage = new StringBuilder();
        prepearingMessage.append("The secret is prepared: ");
        prepearingMessage.append("*".repeat(Math.max(0, size)));
        if(charSize <= 10) {
            prepearingMessage.append(" (0-").append(charSize - 1).append(").");
        } else if (charSize == 11){
            prepearingMessage.append(" (0-9, a).");
        } else {
            prepearingMessage.append(" (0-9, a-").append(charList.charAt(charSize - 1)).append(").");
        }
        System.out.println(prepearingMessage);
        return randomCode;
    }

    public static boolean grade(char[] rightNum) {
        Scanner scan = new Scanner(System.in);
        char[] attempt = scan.nextLine().toCharArray();
        int cowCount = 0;
        int bullCount = 0;
        for (int i = 0; i < rightNum.length; i++) {
            if (attempt[i] == rightNum[i]) {
                bullCount++;
                continue;
            }
            for (int j = 0; j < rightNum.length; j++) {
                if (attempt[i] == rightNum[j]) {
                    cowCount++;
                }
            }
        }
        if (bullCount + cowCount == 0) {
            System.out.println("Grade: None");
        } else if (bullCount != 0 && cowCount != 0) {
            System.out.println("Grade: " + bullCount + " bull(s) and " + cowCount + " cow(s)");
        } else if (bullCount != 0 && cowCount == 0) {
            System.out.println("Grade: " + bullCount + " bull(s)");
        } else {
            System.out.println("Grade: " + cowCount + " cow(s)");
        }
        return bullCount == rightNum.length;
    }
}
