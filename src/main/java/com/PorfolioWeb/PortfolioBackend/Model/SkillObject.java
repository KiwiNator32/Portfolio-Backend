package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer percentage;
    private String title;
    private String skill;

    public SkillObject() {}

    public SkillObject( Integer percentage, String title, String skill) {

        this.percentage = percentage;
        this.title = title;
        this.skill = skill;
    }
}
