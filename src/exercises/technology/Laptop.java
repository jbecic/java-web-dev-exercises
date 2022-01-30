package exercises.technology;

public class Laptop extends Computer{
    private double batteryLife;

    public Laptop(int id, String aCpu, double aWeight, double aBatteryLife) {
        super(id, aCpu,aWeight);
        this.batteryLife = aBatteryLife;
        this.setFixedLocation(false);
    }

    public String howLong() {
        return "This laptop has a battery life of " + batteryLife + " hours!";
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
}
