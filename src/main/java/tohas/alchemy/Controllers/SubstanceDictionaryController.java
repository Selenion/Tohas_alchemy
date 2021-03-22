package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.SubstanceDictionary;
import tohas.alchemy.Repository.SubstanceDictionaryRepository;

import javax.validation.Valid;

@RestController
@RequestMapping(path ="/api/dictionary/substance")
public class SubstanceDictionaryController {

    @Autowired
    private SubstanceDictionaryRepository substanceDictionaryRepository;


    @GetMapping(path = "/{id}", produces = "application/json")
    public Object getSubstanceById(@Valid @PathVariable Long id) {

        if (substanceDictionaryRepository.existsById(id)){
            return substanceDictionaryRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping(path = "/list", produces = "application/json")
    public Object getSubstanceList(){
        return substanceDictionaryRepository.findAll();
    }


    @PostMapping(path = "/new", consumes = "application/json")
    public Object setNewPacking(@Valid @RequestBody SubstanceDictionary substanceDictionary){
        substanceDictionaryRepository.save(substanceDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }

}
