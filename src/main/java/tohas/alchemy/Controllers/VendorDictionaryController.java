package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.VendorDictionary;
import tohas.alchemy.Repository.VendorDictionaryRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path ="/api/dictionary/vendor")
public class VendorDictionaryController {

    @Autowired
    private VendorDictionaryRepository vendorDictionaryRepository;

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<VendorDictionary> getVendorDictionaryById(@Valid @PathVariable Long id){
        if (vendorDictionaryRepository.existsById(id)){
            return new ResponseEntity(vendorDictionaryRepository.findById(id),HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/list", produces = "application/json")
    public ResponseEntity<List<VendorDictionary>> getVendorDictionaryList(){
        return new ResponseEntity(vendorDictionaryRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public ResponseEntity setNewVendorDictionary(@Valid @RequestBody VendorDictionary vendorDictionary){
        vendorDictionaryRepository.save(vendorDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }

}
