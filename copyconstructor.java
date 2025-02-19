class Stduent {
    int id;
    String name;

   
    Stduent(int i, String n) {
        id = i;
        name = n;
    }

   
    Stduent(Stduent s) {
        id = s.id;
        name = s.name;
    }

   
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
       
        Stduent s1 = new Stduent(1, "Krupa"); 
        Stduent s2 = new Stduent(2, "Dhara"); 

        
        s1.display();
        s2.display();
    }
}
