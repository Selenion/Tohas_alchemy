package tohas.alchemy.Entities;

import javax.persistence.*;

@Entity
public class Substance {

    @EmbeddedId
    SubstanceId substanceId;

    String name;

    @GeneratedValue(strategy = GenerationType.AUTO)
    Long vendor_code;

    int quantity;

    Long price;

    public Substance() {
    }

    public Substance(SubstanceId substanceId, String name, Long vendor_code, int quantity, Long price) {
        this.substanceId = substanceId;
        this.name = name;
        this.vendor_code = vendor_code;
        this.quantity = quantity;
        this.price = price;
    }
}
