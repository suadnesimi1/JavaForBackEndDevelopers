package OOP.Polymorphism;

public class Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sound();
        pigeon pigeon = new pigeon();
        pigeon.sound();
        sparrow sparrow = new sparrow();
        sparrow.sound();
    }
    public void sound(){
        System.out.println("birds sound");
    }
}
class pigeon extends Bird{
    @Override
    public void sound(){
        System.out.println("cooing");
    }
}
class sparrow extends Bird{
    @Override
    public void sound(){
        System.out.println("Chip");
    }
        }
