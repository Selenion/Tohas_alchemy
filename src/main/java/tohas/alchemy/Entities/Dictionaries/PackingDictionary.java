package tohas.alchemy.Entities.Dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class PackingDictionary {


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_packing_dictionary")
    @SequenceGenerator(allocationSize = 100, name="seq_packing_dictionary", sequenceName="seq_packing_dictionary")
    Long id;

    @NotNull
    @Getter
    @Setter
    String packingName;

    public PackingDictionary() {
    }

    public PackingDictionary(@NotNull String packingName) {
        this.packingName = packingName;
    }
}
