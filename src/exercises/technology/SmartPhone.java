package exercises.technology;

public class SmartPhone extends Computer{
    private boolean notForMultiTasking = true;

    public SmartPhone(int id, String aCpu, double aWeight) {
        super(id, aCpu, aWeight);
        this.setFixedLocation(false);
    }

    public boolean isNotForMultiTasking() {
        return notForMultiTasking;
    }

    public void setNotForMultiTasking(boolean notForMultiTasking) {
        this.notForMultiTasking = notForMultiTasking;
    }
}
