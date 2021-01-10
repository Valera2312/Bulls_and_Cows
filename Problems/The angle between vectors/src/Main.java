import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();

        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();

        double a_length = Math.sqrt(Math.pow(ax,2)+Math.pow(ay,2));
        double b_length = Math.sqrt(Math.pow(bx,2)+Math.pow(by,2));

        double scalar = (ax * bx) + (ay * by);


        double angle = Math.toDegrees(Math.acos(scalar/(Math.abs(a_length)*Math.abs(b_length))));
        System.out.println(angle);


    }
}