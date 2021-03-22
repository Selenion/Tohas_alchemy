package tohas.alchemy.Views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tohas.alchemy.Entities.Qualification;
import tohas.alchemy.Entities.Vendor;


import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VendorView {

    String vendorName;

    List<QualificationView> qualificationViewList;

    public void fillVendorView(Vendor vendor){
        vendorName = vendor.getVendorDictionary().getVendorName();
        for (Qualification qualification: vendor.getQualificationList()
             ) {
            QualificationView qualificationView = new QualificationView();
            qualificationView.fillQualificationView(qualification);
            qualificationViewList.add(qualificationView);
        }
    }
}
