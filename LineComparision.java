import java.util.Scanner;

public class LineCompare {

//Class for storing all the required logic
static class CompareTwoLne{
    //Function for reading User input
    void variables(){
        Scanner scan = new Scanner(System.in);
        double x1,x2,y1,y2,a1,a2,b1,b2;

        System.out.println("Line-1:- Enter your X1 value:");
        x1 = scan.nextInt();

        System.out.println("Line-1:-Enter your y1 value:");
        y1 = scan.nextInt();

        System.out.println("Line-1:-Enter your X2 value:");
        x2 = scan.nextInt();

        System.out.println("Line-1:-Enter your Y2 value:");
        y2 = scan.nextInt();

        System.out.println("Line-2:-Enter your X1 value:");
        a1 = scan.nextInt();

        System.out.println("Line-2:-Enter your Y1 value:");
        b1 = scan.nextInt();

        System.out.println("Line-2:-Enter your X2 value:");
        a2 = scan.nextInt();

        System.out.println("Line-2:-Enter your Y2 value:");
        b2 = scan.nextInt();

        scan.close();
        lineComparison(x1, x2, y1, y2, a1, a2, b1, b2);
    }
    //alculating the Length
    void lineComparison(double x1,double x2,double y1, double y2,double a1,double a2,double b1,double b2){

        double distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+distance1);

        double distance2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
        System.out.println("The length of line-2 is :"+distance2);

        comparison(distance2,distance1);
    }
    //comparing lengths
    void comparison(double distance1, double distance2){
        String myStr1 = Double.toString(distance1);
        String myStr2 = Double.toString(distance2);

        if(myStr1.compareTo(myStr2) ==0) {
            System.out.println("The line lengths are equal");
        }
        else if(myStr1.compareTo(myStr2) >0) {
            System.out.println("The line-1 length is greater than line-2 length");
        }
        else {
            System.out.println("The line-1 length is smaller than line-2 length");
        }
    }
}
    public static void main(String[] args) {
        CompareTwoLne object = new CompareTwoLne();
        object.variables();
    }
}