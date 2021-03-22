package tohas.alchemy.Views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tohas.alchemy.Entities.Packing;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PackingView {

    String packingName;

    long price;

    long quantity;

    public void fillPackingView(Packing packing){
        packingName = packing.getPackingDictionary().getPackingName();
        price = packing.getPrice();
        quantity = packing.getPrice();
    }
}
