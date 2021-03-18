package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Packing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
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
