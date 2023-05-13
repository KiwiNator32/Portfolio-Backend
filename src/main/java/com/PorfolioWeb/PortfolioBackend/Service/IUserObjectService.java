package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.UserObject;

import java.util.List;
import java.util.Optional;

public interface IUserObjectService {

    public List<UserObject> GetList();
    public void NewObject (UserObject obj);
    public void DeleteObject (Long id );
    public Optional<UserObject> SearchObject (Long id );
}
