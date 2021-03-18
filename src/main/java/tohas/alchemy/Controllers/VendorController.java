package tohas.alchemy.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tohas.alchemy.Entities.Vendor;
import tohas.alchemy.Repository.VendorRepository;

import javax.validation.Valid;

@RestController
public class VendorController {

    private VendorRepository vendorRepository;

    @GetMapping(path = "/api/vendor/{id}", produces = "application/json")
    public Object getVendorById (@Valid @PathVariable Long id){
        if (vendorRepository.existsById(id)){
            return vendorRepository.findById(id);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/api/vendor/list", produces = "application/json")
    public Object getVendorList (){
        return vendorRepository.findAll();
    }

    @PostMapping(path = "/api/vendor/new", consumes = "application/json")
    public Object setNewVendor(@Valid @RequestBody Vendor vendor){
        vendorRepository.save(vendor);
        return new ResponseEntity(HttpStatus.OK);
    }

}
