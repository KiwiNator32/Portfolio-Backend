package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.PersonalInfoObject;
import com.PorfolioWeb.PortfolioBackend.Repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalInfoService implements IPersonalInfoService{

    @Autowired
    public PersonalInfoRepository PersRep;

    @Override
    public List<PersonalInfoObject> GetList() {
        return PersRep.findAll();
    }

    @Override
    public void NewObject(PersonalInfoObject obj) {
        PersRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        PersRep.deleteById(id);
    }

    @Override
    public Optional<PersonalInfoObject> SearchObject(Long id) {
        return PersRep.findById(id);
    }
}
