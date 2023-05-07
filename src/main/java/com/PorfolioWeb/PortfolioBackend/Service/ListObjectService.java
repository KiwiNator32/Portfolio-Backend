package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.ListObject;
import com.PorfolioWeb.PortfolioBackend.Repository.ListObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListObjectService implements IListObjectService {

    @Autowired
    public ListObjectRepository ObjectRep;

    @Override
    public List<ListObject> GetList() {
        return ObjectRep.findAll();
    }

    @Override
    public void NewObject(ListObject obj) {
        ObjectRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        ObjectRep.deleteById(id);
    }

    @Override
    public Optional<ListObject> SearchObject(Long id) {
        return ObjectRep.findById(id);
    }
}
