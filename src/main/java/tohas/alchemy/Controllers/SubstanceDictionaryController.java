package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.SubstanceDictionary;
import tohas.alchemy.Repository.SubstanceDictionaryRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path ="/api/dictionary/substance")
public class SubstanceDictionaryController {

    @Autowired
    private SubstanceDictionaryRepository substanceDictionaryRepository;


    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<SubstanceDictionary> getSubstanceById(@Valid @PathVariable Long id) {

        if (substanceDictionaryRepository.existsById(id)){
            return new ResponseEntity(substanceDictionaryRepository.findById(id), HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping(path = "/list", produces = "application/json")
    public ResponseEntity<List<SubstanceDictionary>> getSubstanceList(){
        return new ResponseEntity(substanceDictionaryRepository.findAll(), HttpStatus.OK);
    }


    @PostMapping(path = "/new", consumes = "application/json")
    public ResponseEntity setNewPacking(@Valid @RequestBody SubstanceDictionary substanceDictionary){
        substanceDictionaryRepository.save(substanceDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }

}
