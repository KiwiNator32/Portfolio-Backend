package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.BannerObject;
import com.PorfolioWeb.PortfolioBackend.Repository.BannerObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BannerObjectService implements IBannerObjectService {

    @Autowired
    public BannerObjectRepository BannRep;

    @Override
    public List<BannerObject> GetList() {
        return BannRep.findAll();
    }

    @Override
    public void NewObject(BannerObject obj) {
        BannRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        BannRep.deleteById(id);
    }

    @Override
    public Optional<BannerObject> SearchObject(Long id) {
        return BannRep.findById(id);
    }
}
