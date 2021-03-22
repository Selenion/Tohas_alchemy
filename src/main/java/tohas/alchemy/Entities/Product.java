package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_productcode")
    @SequenceGenerator(allocationSize = 100, name="seq_productcode", sequenceName="seq_productcode")
    @Getter
    Long code;

    @Getter
    @Setter
    @OneToOne
    Substance substance;

    @Getter
    @Setter
    @OneToOne
    Vendor vendor;

    @Getter
    @Setter
    @OneToOne
    Qualification qualification;

    @Getter
    @Setter
    @OneToOne
    Packing packing;

    @Getter
    @Setter
    int quantity;

    @Getter
    @Setter
    long price;

    public Product() {
    }

    public Product(Substance substance, Vendor vendor, Qualification qualification, Packing packing, int quantity, long price) {
        this.substance = substance;
        this.vendor = vendor;
        this.qualification = qualification;
        this.packing = packing;
        this.quantity = quantity;
        this.price = price;
    }
}
