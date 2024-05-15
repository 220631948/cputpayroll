package za.ac.cput.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
@DiscriminatorValue("2")
public class Pen extends MyProduct{
    protected String color;

    protected Pen() {}

    public Pen(long productId, String name, String color) {
        super(productId, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
