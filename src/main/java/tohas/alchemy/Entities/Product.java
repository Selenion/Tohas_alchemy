package tohas.alchemy.Entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    Long code;

    @OneToOne
    Substance substance;

    @OneToOne
    Vendor vendor_id;

    @OneToOne
    Qualification qualification_id;

    @OneToOne
    Packing packing_id;

    int quantity;

    long price;

}
