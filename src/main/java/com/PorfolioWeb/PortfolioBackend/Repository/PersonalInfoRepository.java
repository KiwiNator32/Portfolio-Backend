package com.PorfolioWeb.PortfolioBackend.Repository;

import com.PorfolioWeb.PortfolioBackend.Model.PersonalInfoObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfoObject, Long> {
}
