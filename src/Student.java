public class Student extends Person{
    // Variables
    String program;
    int year;
    double fee;

    // Constructors
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }


    // Methods
    public String getProgram() { return program; }
    public void setProgram(String newProgram) { this.program = newProgram; }

    public int getYear() { return year; }
    public void setYear(int newYear) { this.year = newYear; }

    public double getFee() { return fee; }
    public void setFee (double newFee) { this.fee = newFee; }

    @Override
    public String toString (){
        return "Student[Person[name = " + name + ", address = " + address + "]"
                + "program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }
}
