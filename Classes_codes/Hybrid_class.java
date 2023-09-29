class Animals {
    void alive() {
        System.out.println("Is Alive");
    }

    void dead() {
        System.out.println("Is Dead");
    }
}

class bird extends Animals {
    void fly() {
        System.out.println("Flies");
    }
}

class dodo extends bird {

    void fly() {
        System.out.println("Don't fly");
    }
}

class fish extends Animals {
    void swim() {
        System.out.println("swims");
    }
}

public class Hybrid_class {

    public static void main(String[] args) {
        dodo d = new dodo();
        d.fly();

    }

}
