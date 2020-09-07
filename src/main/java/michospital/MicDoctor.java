package michospital;

/**
 * Created by Michel Koolwaaij on 07-09-20.
 */
public class MicDoctor {
    private final MicDepartement micDepartement = new MicDepartement();
    private String name;
    private double salary;


    public MicDoctor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public void setNrOfBeds(int nrOfBeds) {
        micDepartement.setNrOfBeds(nrOfBeds);
    }

    public void setNrOfPatients(int nrOfPatients) {
        micDepartement.setNrOfPatients(nrOfPatients);
    }

    public double getSalary() {

        if (micDepartement.deservesBonus())
            return salary * 1.10;
        return salary;
    }

}

