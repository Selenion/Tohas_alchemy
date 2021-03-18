package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Substance;
import tohas.alchemy.Entities.SubstanceId;

@Repository
public interface SubstanceRepository extends CrudRepository<Substance, SubstanceId> {
}
