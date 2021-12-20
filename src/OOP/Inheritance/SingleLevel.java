package OOP.Inheritance;

class SingleLevel {
    public static void main(String[] args) {
        mercedes mercedes = new mercedes();
        mercedes.engine();
        mercedes.color();
        mercedes.model();
    }
}


class car {
    void color() {
        System.out.println("Black");
    }
}
class mercedes extends car {
    void engine() {
        System.out.println("W212");
    }

    void model() {
        System.out.println("E320");
    }
}

