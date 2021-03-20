package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    Long code;

    @Getter
    @Setter
    @OneToOne
    Substance substance;

    @Getter
    @Setter
    @OneToOne
    Vendor vendor_id;

    @Getter
    @Setter
    @OneToOne
    Qualification qualification_id;

    @Getter
    @Setter
    @OneToOne
    Packing packing_id;

    @Getter
    @Setter
    int quantity;

    @Getter
    @Setter
    long price;

    public Product() {
    }

    public Product(Substance substance, Vendor vendor_id, Qualification qualification_id, Packing packing_id, int quantity, long price) {
        this.substance = substance;
        this.vendor_id = vendor_id;
        this.qualification_id = qualification_id;
        this.packing_id = packing_id;
        this.quantity = quantity;
        this.price = price;
    }
}
