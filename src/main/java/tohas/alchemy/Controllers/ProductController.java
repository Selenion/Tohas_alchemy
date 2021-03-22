package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Product;
import tohas.alchemy.Repository.ProductRepository;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/api/product/{id}", produces = "application/json")
    public Object getProductById(@Valid @PathVariable Long id){
        if (productRepository.existsById(id)) {
            return productRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/api/product/new", consumes = "application/json")
    public Object createNewProduct(@RequestBody Product product){
        productRepository.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping(path = "/api/productbysubstance/{id}", produces = "application/json")
    public Object getProductsBySubstance(@Valid @PathVariable Long id){
        return productRepository.findProductsBySubstance_Id(id);
    }


}
