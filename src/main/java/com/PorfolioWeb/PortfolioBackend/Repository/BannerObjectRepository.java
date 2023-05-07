package com.PorfolioWeb.PortfolioBackend.Repository;

import com.PorfolioWeb.PortfolioBackend.Model.BannerObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerObjectRepository extends JpaRepository<BannerObject, Long> {
}
