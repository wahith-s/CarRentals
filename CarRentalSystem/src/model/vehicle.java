package model;

public abstract class vehicle {
    protected int id;
    protected String model;
    protected boolean isRented;

    public vehicle(int id, String model) {
        this.id = id;
        this.model = model;
        this.isRented = false;
    }

    public abstract void displayDetails();
    public abstract void invoice();

    public int getId() { return id; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { this.isRented = rented; }
}
