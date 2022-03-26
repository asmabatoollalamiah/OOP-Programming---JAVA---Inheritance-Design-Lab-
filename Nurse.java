public class Nurse extends HospitalEmployee {
    int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public String toString() {
        return  getName() + " " + getNumber() + " has " + numOfPatients + " Patients.";
    }

    public void work() {
        System.out.println (name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
    }
}
