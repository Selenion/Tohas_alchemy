package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;
import tohas.alchemy.Entities.Dictionaries.QualificationDictionary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_qualification")
    @SequenceGenerator(allocationSize = 100, name="seq_qualification", sequenceName="seq_qualification")
    @Getter
    long id;

    @Getter
    @Setter
    @OneToOne
    QualificationDictionary qualificationDictionary;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL)
    List<Packing> packingList;

    public Qualification() {
    }

    public Qualification(QualificationDictionary qualificationDictionary, List<Packing> packingList) {
        this.qualificationDictionary = qualificationDictionary;
        this.packingList = packingList;
    }

    public void deletePackingFromList(@NotNull Long id){
        packingList.remove(id);
    }

    public void addPackingToList(@NotNull Packing packing){
        packingList.add(packing);
    }
}
