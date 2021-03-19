package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Packing;
import tohas.alchemy.Repository.PackingRepository;

import javax.validation.Valid;

@RestController
public class PackingController {

    @Autowired
    private PackingRepository packingRepository;

    @GetMapping(path = "/api/packing/{id}", produces = "application/json")
    public Object getPackingById (@Valid @PathVariable Long id){
        if (packingRepository.existsById(id)){
            return packingRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/api/packing/list", produces = "application/json")
    public Object getPackingList (){
        return packingRepository.findAll();
    }

    @PostMapping(path = "/api/packing/new", consumes = "application/json")
    public Object setNewPacking(@Valid @RequestBody String packing){
        packingRepository.save(new Packing(packing));
        return new ResponseEntity(HttpStatus.OK);
    }
}
