package Fabric;

import Interface.IGameItem;
import Product.Sapphire;

public class SapphireGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
    
}
