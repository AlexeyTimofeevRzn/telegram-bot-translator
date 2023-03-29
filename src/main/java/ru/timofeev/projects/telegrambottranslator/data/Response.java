package ru.timofeev.projects.telegrambottranslator.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "response")
@Getter
@Setter
public class Response {

    @Id
    private int id;

    @Column(name = "response_text")
    private String response;


}
