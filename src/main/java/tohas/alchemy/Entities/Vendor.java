package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Vendor(Long id, @NotNull String vendor_name) {
        this.id = id;
        this.vendor_name = vendor_name;
    }
}
