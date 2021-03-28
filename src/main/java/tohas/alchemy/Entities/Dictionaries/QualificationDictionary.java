package tohas.alchemy.Entities.Dictionaries;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class QualificationDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_qualification_dictionary")
    @SequenceGenerator(allocationSize = 100, name="seq_qualification_dictionary", sequenceName="seq_qualification_dictionary")
    @Getter
    Long id;

    @NotNull
    @Getter
    @Setter
    String qualificationName;

    @NotNull
    @Getter
    @Setter
    String qualificationDetails;

    public QualificationDictionary() {
    }

    public QualificationDictionary(@NotNull String qualificationName) {
        this.qualificationName = qualificationName;
    }
}
