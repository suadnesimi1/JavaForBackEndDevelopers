package OOP.Methods;

public class FinalM {
}
class demoParent{
    final void method(){
        System.out.println("Paren class final method");
    }
}
class demoChild extends demoParent{
    // here is the error, because we cannot override the final method

    /*void method(){
        System.out.println("Final method modified inside child class");
    }

     */

    public static void main(String[] args) {
        demoChild d = new demoChild();
        d.method();
    }
}
