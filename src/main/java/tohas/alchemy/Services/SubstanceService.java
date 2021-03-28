package tohas.alchemy.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tohas.alchemy.Repository.*;

@Service
public class SubstanceService {

    @Autowired
    SubstanceRepository substanceRepository;

    @Autowired
    PackingRepository packingRepository;

    @Autowired
    VendorRepository vendorRepository;

    @Autowired
    QualificationRepository qualificationRepository;

    @Autowired
    SubstanceDictionaryRepository substanceDictionaryRepository;

    @Autowired
    VendorDictionaryRepository vendorDictionaryRepository;

    @Autowired
    QualificationDictionaryRepository qualificationDictionaryRepository;

    @Autowired
    PackingDictionaryRepository packingDictionaryRepository;

    public void changePackingDictionary(Long packingId, Long dictionaryId){
        packingRepository.findById(packingId)
                .ifPresent(packing -> packing.setPackingDictionary(packingDictionaryRepository.findById(dictionaryId).orElse(null)));
    }

    public void changeQualificationDictionary(Long qualificationId, Long dictionaryId){
        qualificationRepository.findById(qualificationId)
                .ifPresent(qualification -> qualification.setQualificationDictionary(qualificationDictionaryRepository.findById(dictionaryId).orElse(null)));
    }

    public void changeVendorDictionary(Long vendorId, Long dictionaryId){
        vendorRepository.findById(vendorId)
                .ifPresent(vendor -> vendor.setVendorDictionary(vendorDictionaryRepository.findById(dictionaryId).orElse(null)));
    }

    public void changeSubstanceDictionary(Long substanceId, Long dictionaryId){
        substanceRepository.findById(substanceId)
                .ifPresent(substance -> substance.setSubstanceDictionary(substanceDictionaryRepository.findById(dictionaryId).orElse(null)));
    }
}
