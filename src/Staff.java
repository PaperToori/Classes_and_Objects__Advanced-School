public class Staff extends Person {
    // Variables
    String school;
    double pay;

    // Constructors
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Methods
    public String getSchool() { return school; }
    public void setSchool(String newSchool) { this.school = newSchool; }

    public double getPay () { return pay; }
    public void setPay(int newPay) { this.pay = newPay; }

    @Override
    public String toString (){
        return "Staff[Person[name = " + name + ", address = " + address + "]"
                + "school = " + school + ", pay = " + pay + "]";
    }
}
