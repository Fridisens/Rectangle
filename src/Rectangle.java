public class Rectangle {

//Instansvariabler
    int x;
    int y;
    double width;
    double height;

    //Sista punkten:

    //double SetWidth;
    //double SetHeight;

    //Konstruktor
    public Rectangle() {
        this.width = 0;
        this.height = 0;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(double width, double height) {
         this.width = width;
         this.height = height;
         this.x = 0;
         this.y = 0;
    }

    public Rectangle(double width, double height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    //Instansmetoder
    public double calculateArea(double width, double height) {
        return width*height;
    }

    public double calculatePerimeter(double width, double height) {
        return width*width+height*height;
    }

    public int setXY(int x, int y) {
        return x+y;
    }

    public double SetWidth(double width){
        return width;
    }
    public double SetHeight(double height){
        return height;
    }
}
