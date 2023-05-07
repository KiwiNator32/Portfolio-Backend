package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.UlListObject;

import java.util.List;
import java.util.Optional;

public interface IUlListObjectService {

    public List<UlListObject> GetList();
    public void NewObject (UlListObject obj);
    public void DeleteObject (Long id );
    public Optional<UlListObject> SearchObject (Long id );

}
