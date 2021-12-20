package OOP.Object;
/*
in this example we will show how multiple objects are created in the same class
and how they are accessed from another class.
 */
public class Mybook {
    int x=10;
    int y=8;
}
class Count{
    public static void main(String[] args) {
        Mybook mybook1 = new Mybook();
        Mybook mybook2= new Mybook();
        System.out.println(mybook1.x);
        System.out.println(mybook2.y);
    }
}
