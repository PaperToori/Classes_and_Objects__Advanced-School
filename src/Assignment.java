import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Assignment {
    // Variables

    // Constructor
    public Assignment (){}

    // Method(s)
    public void run(){

        // Initial test of Person class
        System.out.println("Running test...");
        Person p = new Person ("Jerimiah Swatts", "Hughston 69");
        System.out.println("Person created.");
        System.out.println(p.toString());

        // Creating and checking students
        Student a = new Student("Elijah Knight", "Some cave, probably", "Anger Managment", 1, 125);
        Student b = new Student("Tessia Eralith", "Castle in the Sky", "Princess Syndrome", 2, 1000000000);
        Student c = new Student("Arthur Leywin", "Hell, probably", "Plot Armor", 2, 700);
        Student d = new Student("Jasmine Flamesworth", "Not anymore", "Family Trauma", 3, 10000);
        Student e = new Student("Regis", "Arthur's head", "Female anatomy", 1, 0);

        System.out.println("Students created.");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());

        // Creating and checking Staff
        Staff f = new Staff("Virion Eralith", "Castle in the Sky", "Xyrus", 1000000000);
        Staff g = new Staff("A spy", "Alacrya", "Xyrus", 69);

        System.out.println("Staff created.");

        System.out.println(f.toString());
        System.out.println(g.toString());

        // Testing set-functions on Student class
        e.setAddress("Not in Arthur's head");
        System.out.println(e.getName() + " has changed their address.");
        e.setProgram("Dying repetedly");
        System.out.println(e.getName() + " has changed their program.");
        e.setYear(4);
        System.out.println(e.getName() + " has changed their year.");
        e.setFee(404);
        System.out.println(e.getName() + " has changed their school fee.");
        System.out.println(e.toString());


    }

}
