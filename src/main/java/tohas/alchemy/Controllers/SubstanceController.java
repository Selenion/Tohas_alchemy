package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Substance;
import tohas.alchemy.Repository.SubstanceRepository;
import tohas.alchemy.Views.SubstanceView;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

@RestController
@RequestMapping(path ="/api/substance")
public class SubstanceController {

    @Autowired
    private SubstanceRepository substanceRepository;

    @GetMapping(path = "/{id}", produces = "application/json")
    public Object getSubstanceById(@Valid @PathVariable Long id){
        if (substanceRepository.existsById(id)) {
            SubstanceView substanceView = new SubstanceView();
            substanceView.fillSubstanceView(substanceRepository.findById(id).orElseThrow(()
                    -> new EntityNotFoundException(id.toString())));
            return substanceView;
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public Object createNewSubstance(@RequestBody Substance substance){
        substanceRepository.save(substance);
        return new ResponseEntity(HttpStatus.OK);
    }
}
