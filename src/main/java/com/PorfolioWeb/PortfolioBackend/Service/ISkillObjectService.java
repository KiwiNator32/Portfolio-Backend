package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.SkillObject;

import java.util.List;
import java.util.Optional;

public interface ISkillObjectService {

    public List<SkillObject> GetList();
    public void NewObject (SkillObject obj);
    public void DeleteObject (Long id );
    public Optional<SkillObject> SearchObject (Long id );
}
