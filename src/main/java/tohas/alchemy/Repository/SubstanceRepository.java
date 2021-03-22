package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Substance;

@Repository
public interface SubstanceRepository extends CrudRepository<Substance, Long> {
}
