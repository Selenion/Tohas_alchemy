package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Substance;
import tohas.alchemy.Repository.SubstanceRepository;

import javax.validation.Valid;

@RestController
public class SubstanceController {

    @Autowired
    private SubstanceRepository substanceRepository;


    @GetMapping(path = "/api/substance/{id}", produces = "application/json")
    public Object getSubstanceById (@Valid @PathVariable Long id) {

        if (substanceRepository.existsById(id)){
            return substanceRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }


    @PostMapping(path = "/api/substance/new", consumes = "application/json")
    public Object setNewPacking(@Valid @RequestBody String cas, String name){
        substanceRepository.save(new Substance(cas, name));
        return new ResponseEntity(HttpStatus.OK);
    }

}
