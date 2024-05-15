package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type",
            discriminatorType = DiscriminatorType.INTEGER)
public class MyProduct {
    @Id
    protected long productId;
    protected String name;

    protected MyProduct(){}

    public MyProduct(long productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyProduct myProduct = (MyProduct) o;
        return productId == myProduct.productId && Objects.equals(name, myProduct.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name);
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }

}
