public class Doctor extends HospitalEmployee{
    String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }


    public String toString() {
        return  getName() + " " + getNumber() + " " +specialty;
    }

    public void work() {
        System.out.println (getName() + " works for the hospital. " + getName() + " is a(n) "+ specialty + " doctor.");
    }
}
