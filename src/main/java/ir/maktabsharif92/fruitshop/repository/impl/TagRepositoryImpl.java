package ir.maktabsharif92.fruitshop.repository.impl;

import ir.maktabsharif92.fruitshop.base.repository.BaseRepositoryImpl;
import ir.maktabsharif92.fruitshop.domain.Tag;
import ir.maktabsharif92.fruitshop.repository.Database;
import ir.maktabsharif92.fruitshop.repository.TagRepository;

public class TagRepositoryImpl extends BaseRepositoryImpl
        implements TagRepository {

    public TagRepositoryImpl(Tag[] entities) {
        super(entities);
    }


    @Override
    protected void copyTable() {
        Database.setTags((Tag[]) entities);
    }
}
