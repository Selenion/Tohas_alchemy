package tohas.alchemy.Entities;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class SubstanceId implements Serializable {

    private String cas;

    private String name;

    public SubstanceId() {
    }

    public SubstanceId(String cas, String name) {
        this.cas = cas;
        this.name = name;
    }
}
