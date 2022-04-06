import java.util.Objects;

public class Animals {
    private String name;
    private double weight;
    private double length;
    private final static int LEGS_COUNT = 4;

    public int getLegsCount() {
        return LEGS_COUNT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        Animals animals = (Animals) o;
        return name.equals(animals.name);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}
