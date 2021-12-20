package OOP.Methods;

public class AbstractM {
}
// this is an abstract class
abstract class Area{
    //two abstract method inside the abstract class
    abstract int areaSquare(int s);
    abstract int areaRectangle(int l, int b);
    //normal method inside an asbtract class
    public  void display(){
        System.out.println("Normal method in abstract class Area");
    }
}
//normal class extends the abstract class
class Demo extends Area{
    public int areaSquare(int s){
        return s*s;
    }
    public int areaRectangle(int l, int b){
        return l*b;
    }

    public static void main(String[] args) {
        Area a = new Demo(); //
        System.out.println("Area of square is: "+a.areaSquare(9));
        System.out.println("Area of rectangle is: "+a.areaRectangle(3,4));
        a.display();
    }
}
