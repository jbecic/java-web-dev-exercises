package exercises.technology;

public class Computer extends AbstractEntity{
    private String cpu;
    private double weight;
    private boolean fixedLocation = true;

    public Computer(int id,String aCpu, double aWeight) {
        super(id);
        this.cpu = aCpu;
        this.weight = aWeight;
    }

    public String computerDescription() {
        return "The brain of it is a: " + cpu + "." + " It has a weight of " + weight + ". " + "It is location fixed: " + fixedLocation + ".";
    }

    public boolean isItMobile() {
        if (this.weight > 2 && this.weight < 32 && !this.fixedLocation) {
            return true;
        }
        if (this.weight < 2 && !this.fixedLocation) {
            return true;
        }
        return false;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFixedLocation() {
        return fixedLocation;
    }

    public void setFixedLocation(boolean fixedLocation) {
        this.fixedLocation = fixedLocation;
    }
}
