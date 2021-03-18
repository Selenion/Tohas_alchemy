package tohas.alchemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tohas.alchemy.Repository.SubstanceRepository;

@RestController
public class SubstanceController {

    @Autowired
    private SubstanceRepository substanceRepository;

}
