package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.CardObject;
import com.PorfolioWeb.PortfolioBackend.Repository.CardObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardObjectService implements ICardObjectService {

    @Autowired
    public CardObjectRepository CardRep;

    @Override
    public List<CardObject> GetCards() {
        return CardRep.findAll();
    }

    @Override
    public void NewObject(CardObject obj) {
        CardRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        CardRep.deleteById(id);
    }

    @Override
    public Optional<CardObject> SearchObject(Long id) {
        return CardRep.findById(id);
    }
}
