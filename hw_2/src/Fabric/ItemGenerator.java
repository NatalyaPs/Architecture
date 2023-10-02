package Fabric;

import Interface.IGameItem;

// прототип фабрики
public abstract class ItemGenerator {
    // абстрактный, т.к. фабрике придется переопределять этот метод
    public abstract IGameItem createItem();
    public void openReward() {
        createItem().open();
    }
    // при вызове метода openReward мы создадим новый продукт (createItem) и сразу его откроем 
}

