package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Substance;

import java.util.List;

@Repository
public interface SubstanceRepository extends CrudRepository<Substance, Long> {
    Boolean existsByCas(String cas);
    List<Substance> findAllByCas(String cas);
}
