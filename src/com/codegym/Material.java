package material;

import java.time.LocalDate;

public abstract class Material {
    LocalDate manufacturingDate = LocalDate.parse("2021-09-25");
    private String id;
    private String name;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
}
