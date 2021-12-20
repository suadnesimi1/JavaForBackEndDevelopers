package OOP.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.model();
        audi.year();
        audi.color();
        Volvo volvo = new Volvo();
        volvo.model();
        volvo.year();
        volvo.color();
        Honda honda = new Honda();
        honda.model();
        honda.year();
        honda.color();
    }
}
class auto{
    void color(){
        System.out.println("Black");
    }
}
class Audi extends auto{
    void model(){
        System.out.println("Audi A6");
    }
    void year(){
        System.out.println("2022");
    }
}
class Honda extends auto{
    void model(){
        System.out.println("B312");
    }
    void year(){
        System.out.println("2011");
    }
        }
class Volvo extends auto{
    void model(){
        System.out.println("Volvo 20");
    }
    void year(){
        System.out.println("2015");
    }
}