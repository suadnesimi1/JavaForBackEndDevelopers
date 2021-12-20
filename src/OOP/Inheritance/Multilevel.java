package OOP.Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        Passat passat = new Passat();
        passat.color();
        passat.model();
        passat.year();
    }
}
class cars{
    void color(){
        System.out.println("Black");
    }
}
class VW extends cars{
    void model(){
        System.out.println("Passat");
    }
}
class Passat extends VW{
    void year(){
        System.out.println("2021");
    }

}
