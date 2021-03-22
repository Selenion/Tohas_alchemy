package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Dictionaries.PackingDictionary;

@Repository
public interface PackingDictionaryRepository extends CrudRepository<PackingDictionary, Long> {
}
