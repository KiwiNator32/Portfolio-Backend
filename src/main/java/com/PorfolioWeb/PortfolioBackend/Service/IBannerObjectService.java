package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.BannerObject;

import java.util.List;
import java.util.Optional;

public interface IBannerObjectService {

    public List<BannerObject> GetList();
    public void NewObject (BannerObject obj);
    public void DeleteObject (Long id );
    public Optional<BannerObject> SearchObject (Long id );
}
