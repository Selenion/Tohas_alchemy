package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;
import tohas.alchemy.Entities.Dictionaries.SubstanceDictionary;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Substance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_productcode")
    @SequenceGenerator(allocationSize = 100, name="seq_productcode", sequenceName="seq_productcode")
    @Getter
    Long code;

    @Getter
    @Setter
    @OneToOne
    SubstanceDictionary substanceDictionary;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL)
    List<Vendor> vendorList;

    public Substance() {
    }

    public Substance(SubstanceDictionary substanceDictionary, List<Vendor> vendorList) {
        this.substanceDictionary = substanceDictionary;
        this.vendorList = vendorList;
    }


    public void deleteVendorFromList(@NotNull Long id){
        vendorList.remove(id);
    }

    public void addVendorToList(@NotNull Vendor vendor) {
        vendorList.add(vendor);
    }
}
