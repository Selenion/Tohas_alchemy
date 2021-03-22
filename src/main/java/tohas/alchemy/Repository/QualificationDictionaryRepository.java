package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Dictionaries.QualificationDictionary;

@Repository
public interface QualificationDictionaryRepository extends CrudRepository<QualificationDictionary, Long> {
}
