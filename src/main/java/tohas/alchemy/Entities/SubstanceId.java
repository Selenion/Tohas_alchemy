package tohas.alchemy.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class SubstanceId implements Serializable {

    @Getter
    @Setter
    @NotNull
    String cas;

    @Getter
    @Setter
    @OneToOne
    Vendor vendor;

    @Getter
    @Setter
    @OneToOne
    Qualification qualification;

    @Getter
    @Setter
    @OneToOne
    Packing packing;

    public SubstanceId() {
    }

    public SubstanceId(@NotNull String cas, Vendor vendor, Qualification qualification, Packing packing) {
        this.cas = cas;
        this.vendor = vendor;
        this.qualification = qualification;
        this.packing = packing;
    }
}
