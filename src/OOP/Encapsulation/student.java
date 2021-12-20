package OOP.Encapsulation;

public class student {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        student student = new student();
        student.setName("Admin");
        System.out.println("Student name is: "+student.getName());
    }
}
