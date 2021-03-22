package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tohas.alchemy.Entities.Dictionaries.SubstanceDictionary;

import java.util.List;

@Repository
public interface SubstanceDictionaryRepository extends CrudRepository<SubstanceDictionary, Long> {
}
