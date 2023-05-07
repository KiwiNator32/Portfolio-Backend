package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.PersonalInfoObject;

import java.util.List;
import java.util.Optional;

public interface IPersonalInfoService {

    public List<PersonalInfoObject> GetList ();
    public void NewObject (PersonalInfoObject obj);
    public void DeleteObject (Long id );
    public Optional<PersonalInfoObject> SearchObject (Long id );
}
