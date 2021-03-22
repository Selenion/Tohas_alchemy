package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vendor")
    @SequenceGenerator(allocationSize = 100, name="seq_vendor", sequenceName="seq_vendor")
    @Getter
    long id;

    @NotNull
    @Getter
    @Setter
    String vendor_name;

    public Vendor() {
    }
}
