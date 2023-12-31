package ir.maktabsharif92.fruitshop.repository.impl;

import ir.maktabsharif92.fruitshop.base.repository.BaseRepositoryImpl;
import ir.maktabsharif92.fruitshop.domain.Fruit;
import ir.maktabsharif92.fruitshop.repository.Database;
import ir.maktabsharif92.fruitshop.repository.FruitRepository;

public class FruitRepositoryImpl extends BaseRepositoryImpl
        implements FruitRepository {

    public FruitRepositoryImpl(Fruit[] entities) {
        super(entities);
    }


    @Override
    protected void copyTable() {
        Database.setFruits((Fruit[]) entities);
    }
}
