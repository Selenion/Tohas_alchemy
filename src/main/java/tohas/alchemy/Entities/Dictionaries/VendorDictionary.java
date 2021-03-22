package tohas.alchemy.Entities.Dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class VendorDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vendor_dictionary")
    @SequenceGenerator(allocationSize = 100, name="seq_vendor_dictionary", sequenceName="seq_vendor_dictionary")
    @Getter
    long id;

    @NotNull
    @Getter
    @Setter
    String vendorName;

    public VendorDictionary() {
    }

    public VendorDictionary(@NotNull String vendorName) {
        this.vendorName = vendorName;
    }
}
