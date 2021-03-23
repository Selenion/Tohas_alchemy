package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Dictionaries.QualificationDictionary;
import tohas.alchemy.Repository.QualificationDictionaryRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path ="/api/dictionary/qualification")
public class QualificationDictionaryController {

    @Autowired
    private QualificationDictionaryRepository qualificationDictionaryRepository;

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<QualificationDictionary> getQualificationDictionaryById(@Valid @PathVariable Long id){
        if (qualificationDictionaryRepository.existsById(id)){
            return new ResponseEntity(qualificationDictionaryRepository.findById(id), HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/list", produces = "application/json")
    public ResponseEntity<List<QualificationDictionary>> getQualificationDictionaryList(){
        return new ResponseEntity(qualificationDictionaryRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public ResponseEntity setNewQualificationDictionary(@Valid @RequestBody QualificationDictionary qualificationDictionary){
        qualificationDictionaryRepository.save(qualificationDictionary);
        return new ResponseEntity(HttpStatus.OK);
    }
}
