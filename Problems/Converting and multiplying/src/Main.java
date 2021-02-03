import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> arrayList = new ArrayList<>();
        while (true){

            String number = scanner.nextLine();
            if(number.equals("0")) {
                break;
            }
            try{
                int n = Integer.parseInt(number);
                System.out.println(n*10);

            }catch (Exception e){
                System.out.println("Invalid user input: " + number);

            }



        }


    }
}