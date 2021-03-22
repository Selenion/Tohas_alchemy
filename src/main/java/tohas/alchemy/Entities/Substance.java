package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        uniqueConstraints=
        @UniqueConstraint(columnNames={"cas", "name"})
)
public class Substance {


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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_substance")
    @SequenceGenerator(allocationSize = 100, name="seq_substance", sequenceName="seq_substance")
    Long id;

    public Substance() {
    }

    public Substance(@NotNull String cas, @NotNull String name) {
        this.cas = cas;
        this.name = name;
    }
}


