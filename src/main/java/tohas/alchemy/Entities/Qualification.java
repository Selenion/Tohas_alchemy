package tohas.alchemy.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Qualification(Long id, @NotNull String qualification_name) {
        this.id = id;
        this.qualification_name = qualification_name;
    }
}
