package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.ListObject;

import java.util.List;
import java.util.Optional;

public interface IListObjectService {

    public List<ListObject> GetList ();
    public void NewObject (ListObject obj);
    public void DeleteObject (Long id );
    public Optional<ListObject> SearchObject (Long id );

}
