public class Person {
    //Variables
    String name;
    String address;

    //Constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Methods
    public String getName(){ return this.name; }

    public String getAddress() { return this.address; }

    public void setAddress(String newAddress){ this.address = newAddress; }

    public String toString(){
        return "Person[name = " + name + ", address = " + address + "]";
    }
}