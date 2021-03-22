package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;
import tohas.alchemy.Entities.Dictionaries.PackingDictionary;

import javax.persistence.*;

@Entity
public class Packing {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_packing")
    @SequenceGenerator(allocationSize = 100, name="seq_packing", sequenceName="seq_packing")
    @Getter
    long id;

    @Getter
    @Setter
    @OneToOne
    PackingDictionary packingDictionary;

    @Getter
    @Setter
    long price;

    @Getter
    @Setter
    long quantity;

    public Packing() {
    }

    public Packing(PackingDictionary packingDictionary, long price, long quantity) {
        this.packingDictionary = packingDictionary;
        this.price = price;
        this.quantity = quantity;
    }
}
