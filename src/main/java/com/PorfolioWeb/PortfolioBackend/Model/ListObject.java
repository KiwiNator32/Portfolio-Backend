package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ListObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;
    private String title;
    private String text;

    public ListObject() {}

    public ListObject(String color, String title, String text) {

        this.color = color;
        this.title = title;
        this.text = text;

    }
}
