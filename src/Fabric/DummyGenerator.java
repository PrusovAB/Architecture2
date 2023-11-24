package Fabric;

import Interface.iGameItem;
import Product.Dummy;

public class DummyGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
       return new Dummy();
    }
    
}
