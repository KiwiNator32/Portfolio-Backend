package com.PorfolioWeb.PortfolioBackend.Service;

import com.PorfolioWeb.PortfolioBackend.Model.ProjectArticleObject;

import java.util.List;
import java.util.Optional;

public interface IProjectArticleService {

    public List<ProjectArticleObject> GetList();
    public void NewObject (ProjectArticleObject obj);
    public void DeleteObject (Long id );
    public Optional<ProjectArticleObject> SearchObject (Long id );
}
