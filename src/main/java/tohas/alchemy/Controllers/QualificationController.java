package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Qualification;
import tohas.alchemy.Entities.Vendor;
import tohas.alchemy.Repository.QualificationRepository;

import javax.validation.Valid;

@RestController
public class QualificationController {

    @Autowired
    private QualificationRepository qualificationRepository;

    @GetMapping(path = "/api/qualification/{id}", produces = "application/json")
    public Object getQualificationById (@Valid @PathVariable Long id){
        if (qualificationRepository.existsById(id)){
            return qualificationRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/api/qualification/list", produces = "application/json")
    public Object getQualificationList (){
        return qualificationRepository.findAll();
    }

    @PostMapping(path = "/api/qualification/new", consumes = "application/json")
    public Object setNewQualification (@Valid @RequestBody Qualification qualification){
        qualificationRepository.save(qualification);
        return new ResponseEntity(HttpStatus.OK);
    }
}
