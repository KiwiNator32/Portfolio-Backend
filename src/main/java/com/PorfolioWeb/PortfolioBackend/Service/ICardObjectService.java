package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.CardObject;

import java.util.List;
import java.util.Optional;

public interface ICardObjectService {

    public List<CardObject> GetCards();
    public void NewObject (CardObject obj);
    public void DeleteObject (Long id );
    public Optional<CardObject> SearchObject (Long id );
}
