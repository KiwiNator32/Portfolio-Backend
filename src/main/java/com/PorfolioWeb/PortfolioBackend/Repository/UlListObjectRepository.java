package com.PorfolioWeb.PortfolioBackend.Repository;

import com.PorfolioWeb.PortfolioBackend.Model.UlListObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UlListObjectRepository extends JpaRepository <UlListObject, Long> {
}
