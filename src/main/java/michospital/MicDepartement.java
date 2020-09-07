package michospital;

public class MicDepartement {
    public static final int MAXALLOWEDPATIENTS = 85;
    protected int nrOfBeds = 1;
    protected int nrOfPatients = 0;

    public MicDepartement() {
    }

    public int getNrOfBeds() {
        return nrOfBeds;
    }

    public int getNrOfPatients() {
        return nrOfPatients;
    }

    public void setNrOfBeds(int nrOfBeds) {
        this.nrOfBeds = nrOfBeds;
    }

    public void setNrOfPatients(int nrOfPatients) {
        this.nrOfPatients = nrOfPatients;
    }

    protected int occupied() {
        return nrOfPatients * 100 / nrOfBeds;
    }

    protected  boolean deservesBonus() {
        return (getNrOfBeds() > 10) && (occupied() > MAXALLOWEDPATIENTS);
    }
}