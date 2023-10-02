package Fabric;

import Interface.IGameItem;
import Product.Bronze;

public class BronzeGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
    
}
