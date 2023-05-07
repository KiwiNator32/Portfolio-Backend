package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class CardObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bg_color;
    private String bg_title;
    private String img_color;
    private String img_dir;
    private String content_text;
    private String info_link;

    public CardObject(){}

    public CardObject( String bg_color, String bg_title, String img_color, String img_dir, String content_text, String info_link ){

        this.bg_color = bg_color;
        this.bg_title = bg_title;
        this.img_color = img_color;
        this.img_dir = img_dir;
        this.content_text = content_text;
        this.info_link = info_link;
    }
}
