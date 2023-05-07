package com.PorfolioWeb.PortfolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class UlListObject {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        private String text;

        public UlListObject() {}

        public UlListObject( String title, String text) {

            this.title = title;
            this.text = text;

        }
}
