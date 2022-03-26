public class Surgeon extends Doctor{
    boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public String toString() {
        return  getName() + " " + getNumber() + " " + specialty + " operating: " +operating;
    }

    public void work() {
        System.out.println (getName() + " works for the hospital. " + getName() + " is operating now.");
    }

}
