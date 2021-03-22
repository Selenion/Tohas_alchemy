package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.PackingDictionary;
import tohas.alchemy.Repository.PackingDictionaryRepository;

import javax.validation.Valid;

@RestController
@RequestMapping(path ="/api/dictionary/packing")
public class PackingDictionaryController {

    @Autowired
    private PackingDictionaryRepository packingDictionaryRepository;

    @GetMapping(path = "/{id}", produces = "application/json")
    public Object getPackingDictionaryById(@Valid @PathVariable Long id){
        if (packingDictionaryRepository.existsById(id)){
            return packingDictionaryRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/list", produces = "application/json")
    public Object getPackingDictionaryList(){
        return packingDictionaryRepository.findAll();
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public Object setNewPackingDictionary(@Valid @RequestBody PackingDictionary packingDictionary){
        packingDictionaryRepository.save(packingDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }
}
