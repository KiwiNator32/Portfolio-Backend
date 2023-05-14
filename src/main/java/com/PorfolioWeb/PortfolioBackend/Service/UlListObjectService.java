package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.UlListObject;
import com.PorfolioWeb.PortfolioBackend.Repository.UlListObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UlListObjectService implements IUlListObjectService{

    @Autowired
    public UlListObjectRepository UlListRep;

    @Override
    public List<UlListObject> GetList() {
        return UlListRep.findAll();
    }

    @Override
    public void NewObject(UlListObject obj) {
        UlListRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        UlListRep.deleteById(id);
    }

    @Override
    public Optional<UlListObject> SearchObject(Long id) {
        return UlListRep.findById(id);
    }

}
