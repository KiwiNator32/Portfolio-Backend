package com.PorfolioWeb.PortfolioBackend.Repository;

import com.PorfolioWeb.PortfolioBackend.Model.ProjectArticleObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectArticleRepository extends JpaRepository<ProjectArticleObject, Long> {
}
