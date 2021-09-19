import java.util.Scanner;

public class Length {

    static class length {

        void variables() {

            Scanner scan = new Scanner(System.in);
            double x1, x2, y1, y2;

            System.out.println("Enter your X1 value:");
            x1 = scan.nextInt();

            System.out.println("Enter your Y1 value :");
            y1 = scan.nextInt();

            System.out.println("Enter your X2 value:");
            x2 = scan.nextInt();

            System.out.println("Enter your Y2 value:");
            y2 = scan.nextInt();

            scan.close();

            lineComparison(x1, x2, y1, y2);
        }
            void lineComparison(double x1, double x2, double y1, double y2) {
            double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
            System.out.println("The length of line is :" + distance);
            }
    }
            public static class LineLength {
                public static void main(String[] args) {
                length object = new length();
                object.variables();
                }
            }
}