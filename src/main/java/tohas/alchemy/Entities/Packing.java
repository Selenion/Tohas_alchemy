package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Packing {


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @Getter
    @Setter
    String packing_name;

    public Packing() {
    }

    public Packing(Long id, @NotNull String packing_name) {
        this.id = id;
        this.packing_name = packing_name;
    }
}
