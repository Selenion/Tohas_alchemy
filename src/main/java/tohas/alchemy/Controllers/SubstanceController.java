package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Substance;
import tohas.alchemy.Repository.SubstanceRepository;
import tohas.alchemy.Services.SubstanceService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

@RestController
@RequestMapping(path ="/api/substance")
public class SubstanceController {

    @Autowired
    private SubstanceRepository substanceRepository;

    @Autowired
    private SubstanceService substanceService;

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Substance> getSubstanceById(@Valid @PathVariable Long id){
        if (substanceRepository.existsById(id)) {
            return new ResponseEntity(substanceRepository.findById(id).orElseThrow(()
                    -> new EntityNotFoundException(id.toString())), HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public ResponseEntity createNewSubstance(@RequestBody Substance substance){
        substanceRepository.save(substance);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(path = "/changesubstancedictionary/{id}", consumes = "application/json")
    public ResponseEntity changeSubstanceDictionary(@Valid @PathVariable Long id, @RequestBody Long dictionaryId){
        try {
            substanceService.changeSubstanceDictionary(id, dictionaryId);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/changevendordictionary/{id}", consumes = "application/json")
    public ResponseEntity changeVendorDictionary(@Valid @PathVariable Long id, @RequestBody Long dictionaryId){
        try {
            substanceService.changeVendorDictionary(id, dictionaryId);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/changequalificationdictionary/{id}", consumes = "application/json")
    public ResponseEntity changeQualificationDictionary(@Valid @PathVariable Long id, @RequestBody Long dictionaryId){
        try {
            substanceService.changeQualificationDictionary(id, dictionaryId);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/changepackingdictionary/{id}", consumes = "application/json")
    public ResponseEntity changePackingDictionary(@Valid @PathVariable Long id, @RequestBody Long dictionaryId){
        try {
            substanceService.changePackingDictionary(id, dictionaryId);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
