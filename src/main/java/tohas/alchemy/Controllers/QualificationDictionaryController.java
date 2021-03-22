package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.QualificationDictionary;
import tohas.alchemy.Repository.QualificationDictionaryRepository;

import javax.validation.Valid;

@RestController
@RequestMapping(path ="/api/dictionary/qualification")
public class QualificationDictionaryController {

    @Autowired
    private QualificationDictionaryRepository qualificationDictionaryRepository;

    @GetMapping(path = "/{id}", produces = "application/json")
    public Object getQualificationDictionaryById(@Valid @PathVariable Long id){
        if (qualificationDictionaryRepository.existsById(id)){
            return qualificationDictionaryRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/list", produces = "application/json")
    public Object getQualificationDictionaryList(){
        return qualificationDictionaryRepository.findAll();
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public Object setNewQualificationDictionary(@Valid @RequestBody QualificationDictionary qualificationDictionary){
        qualificationDictionaryRepository.save(qualificationDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }
}
