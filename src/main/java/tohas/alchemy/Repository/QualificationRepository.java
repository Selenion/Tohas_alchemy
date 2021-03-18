package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Qualification;

@Repository
public interface QualificationRepository extends CrudRepository<Qualification, Long> {
}
