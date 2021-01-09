import java.util.Scanner;

class Main {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder string_new = new StringBuilder();


        for (int i = 0; i < strings.length; i++) {
            string_new.append(strings[i]);

        }
        String a = String.valueOf(string_new).replaceAll("\\d","");
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}