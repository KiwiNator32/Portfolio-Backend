package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PersonalInfoObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String image_url;
    private String title;
    private String text;

    public PersonalInfoObject(){}

    public PersonalInfoObject(String image_url, String title, String text ){
        this.image_url = image_url;
        this.title = title;
        this.text = text;
    }
}
