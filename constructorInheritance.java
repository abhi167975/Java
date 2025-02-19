class Animal {
    Animal() {
        System.out.println("From animal constructor");
    }

    void eat() {
        System.out.println("Eating...");
    }

  
    protected void finalize() {
        System.out.println("End of animal");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("From dog constructor");
    }

    void bark() {
        System.out.println("Barking...");
    }

    protected void finalize() {
        System.out.println("End of dog");
    }
}

class Babydog extends Dog {
    Babydog() {
        System.out.println("From babydog constructor");
    }

    void weep() {
        System.out.println("Weeping...");
    }

    protected void finalize() {
        System.out.println("End of babydog");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        Babydog d = new Babydog();
        d.weep();
        d.bark();
        d.eat();
        d = null;  
        System.gc(); 
    }
}
