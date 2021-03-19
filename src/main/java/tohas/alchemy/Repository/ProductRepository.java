package tohas.alchemy.Repository;

import org.springframework.data.repository.CrudRepository;
import tohas.alchemy.Entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
