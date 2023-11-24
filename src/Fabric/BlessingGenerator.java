package Fabric;

import Interface.iGameItem;
import Product.Blessing;

public class BlessingGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Blessing();
    }
    
}

