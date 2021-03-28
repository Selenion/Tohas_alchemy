package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Packing;

@Repository
public interface PackingRepository extends CrudRepository<Packing, Long> {
}
