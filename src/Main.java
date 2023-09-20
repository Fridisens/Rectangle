import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        double Area = rectangle.calculateArea(4.0,7.5);
        double Perimeter = rectangle.calculatePerimeter(7,3);

        System.out.println("Arean är " + Area);
        System.out.println("Omkretsen är " +Perimeter);

        System.out.println("Du har satt värdena " + rectangle.setXY(7,9));

        System.out.println("Du har satt värdena " + rectangle.SetWidth(5));
        System.out.println("Du har satt värdet " + rectangle.SetHeight(7));



    }
}