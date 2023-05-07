package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ProjectArticleObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;
    private String title;
    private String text;
    private String link;

    ProjectArticleObject() {}

    ProjectArticleObject(String color, String title, String text, String link) {
        this.color = color;
        this.title = title;
        this.text = text;
        this.link = link;
    }
}
