package Fabric;

import Interface.iGameItem;
import Product.Medal;

public class MedalGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
       return new Medal();
    }
    
}
