package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class BannerObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String sub_title;

    BannerObject(){}

    BannerObject(String title, String sub_title){
        this.title = title;
        this.sub_title = sub_title;
    }
}
