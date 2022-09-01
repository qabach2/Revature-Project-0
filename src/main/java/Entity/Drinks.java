package Entity;

public class Drinks {
    public int id;
    public String name;
    public double amount;
    public String description;



    public Drinks(int id, String name, double amount, String description) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Drinks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
