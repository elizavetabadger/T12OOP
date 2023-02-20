public class Transport {
    private String model;
    private int maxSpeed;
    private int year;

    public Transport(String model, int maxSpeed, int year) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }
    public void getInfo() {
        System.out.println(model + " " + maxSpeed + " " + year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void gas() {
    }

    public void brake() {
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                '}';
    }

    public Transport() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
