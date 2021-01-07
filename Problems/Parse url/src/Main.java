import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] URL = scanner.nextLine().split("\\?");
        String[] data = URL[1].split("&");
        boolean pass = false;
        int index = 0;

        for(int i = 0;i < data.length;i++){

            String[] s = data[i].split("=");
            if (s.length < 2) {
                data[i] = data[i] + "not found";
            }
            System.out.println(data[i].replace("="," : "));
            if(data[i].contains("pass")){
                pass = true;
                index = i;
            }
        }
        if(pass){
            System.out.println("password : " + data[index].replace("pass=",""));
        }

    }
}