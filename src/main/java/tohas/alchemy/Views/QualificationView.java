package tohas.alchemy.Views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tohas.alchemy.Entities.Packing;
import tohas.alchemy.Entities.Qualification;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QualificationView {

    String qualificationName;

    List<PackingView> packingViewList;

    public void fillQualificationView (Qualification qualification){
        qualificationName = qualification.getQualificationDictionary().getQualificationName();
        for (Packing packing: qualification.getPackingList()
             ) {
            PackingView packingView = new PackingView();
            packingView.fillPackingView(packing);
            packingViewList.add(packingView);
        }
    }

}
