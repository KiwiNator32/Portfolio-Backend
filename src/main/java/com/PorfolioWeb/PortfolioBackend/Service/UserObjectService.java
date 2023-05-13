package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.UserObject;
import com.PorfolioWeb.PortfolioBackend.Repository.UserObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserObjectService implements IUserObjectService {

    @Autowired
    public UserObjectRepository UserRep;

    @Override
    public List<UserObject> GetList() {
        return UserRep.findAll();
    }

    @Override
    public void NewObject(UserObject obj) {
        UserRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        UserRep.deleteById(id);
    }

    @Override
    public Optional<UserObject> SearchObject(Long id) {
        return UserRep.findById(id);
    }
}
