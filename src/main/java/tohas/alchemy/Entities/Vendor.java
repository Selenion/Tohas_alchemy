package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    Long id;

    @NotNull
    @Getter
    @Setter
    String vendor_name;

    public Vendor() {
    }

    public Vendor(@NotNull String vendor_name) {
        this.vendor_name = vendor_name;
    }
}
