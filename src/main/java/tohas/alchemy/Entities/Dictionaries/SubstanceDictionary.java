package tohas.alchemy.Entities.Dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        uniqueConstraints=
        @UniqueConstraint(columnNames={"cas", "name"})
)
public class SubstanceDictionary {


    @NotNull
    @Getter
    @Setter
    String cas;


    @NotNull
    @Getter
    @Setter
    String name;

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_substance_dictionary")
    @SequenceGenerator(allocationSize = 100, name="seq_substance_dictionary", sequenceName="seq_substance_dictionary")
    Long id;

    public SubstanceDictionary() {
    }

    public SubstanceDictionary(@NotNull String cas, @NotNull String name) {
        this.cas = cas;
        this.name = name;
    }
}


