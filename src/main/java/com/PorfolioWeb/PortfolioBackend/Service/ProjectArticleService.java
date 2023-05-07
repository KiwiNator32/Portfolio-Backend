package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.ProjectArticleObject;
import com.PorfolioWeb.PortfolioBackend.Repository.ProjectArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectArticleService implements IProjectArticleService{

    @Autowired
    public ProjectArticleRepository ArtRep;

    @Override
    public List<ProjectArticleObject> GetList() {
        return ArtRep.findAll();
    }

    @Override
    public void NewObject(ProjectArticleObject obj) {
        ArtRep.save(obj);
    }

    @Override
    public void DeleteObject(Long id) {
        ArtRep.deleteById(id);
    }

    @Override
    public Optional<ProjectArticleObject> SearchObject(Long id) {
        return ArtRep.findById(id);
    }
}
