package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@IdClass(SubstanceId.class)
public class Substance {

    @Id
    @NotNull
    @Getter
    @Setter
    String cas;

    @Id
    @NotNull
    @Getter
    @Setter
    String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    Long id;

    public Substance() {
    }

    public Substance(String cas, String name) {
        this.cas = cas;
        this.name = name;
    }
}


