package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;
import tohas.alchemy.Entities.Dictionaries.VendorDictionary;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vendor")
    @SequenceGenerator(allocationSize = 100, name="seq_vendor", sequenceName="seq_vendor")
    @Getter
    long id;

    @Getter
    @Setter
    @OneToOne
    VendorDictionary vendorDictionary;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL)
    List<Qualification> qualificationList;

    public Vendor() {
    }

    public Vendor(VendorDictionary vendorDictionary, List<Qualification> qualificationList) {
        this.vendorDictionary = vendorDictionary;
        this.qualificationList = qualificationList;
    }
}
