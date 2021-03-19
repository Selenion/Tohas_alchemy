package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Substance;

import java.util.List;

@Repository
public interface SubstanceRepository extends CrudRepository<Substance, Substance> {
    Boolean existsByCas(String cas);
    Boolean existsById(Long id);
    List<Substance> findAllByCas(String cas);
    List<Substance> findById(Long id);
}
