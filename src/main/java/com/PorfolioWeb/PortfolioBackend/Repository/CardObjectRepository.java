package com.PorfolioWeb.PortfolioBackend.Repository;

import com.PorfolioWeb.PortfolioBackend.Model.CardObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardObjectRepository  extends JpaRepository<CardObject, Long> {
}
