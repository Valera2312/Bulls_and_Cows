import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dateAr = date.split("-");

       System.out.println(dateAr[1]+"/"+dateAr[2]+"/"+dateAr[0]);

    }
}