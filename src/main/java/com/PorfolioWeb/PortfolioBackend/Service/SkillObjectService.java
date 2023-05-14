package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.SkillObject;
import com.PorfolioWeb.PortfolioBackend.Repository.SkillObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillObjectService implements ISkillObjectService {

    @Autowired
    public SkillObjectRepository SkillRep;

    @Override
    public List<SkillObject> GetList() {
        return SkillRep.findAll();
    }

    @Override
    public void NewObject(SkillObject obj) {
        SkillRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        SkillRep.deleteById(id);
    }

    @Override
    public Optional<SkillObject> SearchObject(Long id) {
        return SkillRep.findById(id);
    }
}
