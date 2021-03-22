package tohas.alchemy.Views;

import lombok.*;
import tohas.alchemy.Entities.Substance;
import tohas.alchemy.Entities.Vendor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubstanceView implements Serializable {

    Long code;

    String cas;

    String name;

    List<VendorView> vendorViewList;

    public void fillSubstanceView (Substance substance){
        code = substance.getCode();
        cas = substance.getSubstanceDictionary().getCas();
        name = substance.getSubstanceDictionary().getName();
        for (Vendor vendor: substance.getVendorList()
             ) {
            VendorView vendorView = new VendorView();
            vendorView.fillVendorView(vendor);
            vendorViewList.add(vendorView);
        }
    }



}
