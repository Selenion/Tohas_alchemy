package tohas.alchemy.Views;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubstanceSaveView {

    Long code;
    String cas;
    String name;

}
/*{
        "code": 0,
        "cas": "string",
        "name": "string",
        "vendorViewList": [
        {
        "vendorName": "string",
        "qualificationViewList": [
        {
        "qualificationName": "string",
        "packingViewList": [
        {
        "packingName": "string",
        "price": 0,
        "quantity": 0
        }
        ]
        }
        ]
        }
        ]
        }*/
