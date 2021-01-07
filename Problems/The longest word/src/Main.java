import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dateArr = date.split(" ");
        int max = 0;
        int length = 0;
        int flag = 0;
        for(int i = 0; i < dateArr.length;i++){
            length = dateArr[i].length();
            if(length>max){
                max = length;
                flag = i;
            }
        }
        System.out.print(dateArr[flag]);
    }
}