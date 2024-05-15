package za.ac.cput.domain.demography;

import java.util.Objects;

public class Nationality {
    private String id;
    private String description;

    private Nationality() {}

    public Nationality(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() { return id; }

    public String getDescription() { return description; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nationality that = (Nationality) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
