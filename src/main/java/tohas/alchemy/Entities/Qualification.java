package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    Long id;

    @NotNull
    @Getter
    @Setter
    String qualification_name;

    public Qualification() {
    }

    public Qualification(@NotNull String qualification_name) {
        this.qualification_name = qualification_name;
    }
}
