package ru.timofeev.projects.telegrambottranslator.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "request")
public class Request {

    @Id
    private int id;

    @Column(name = "request_text")
    private String request;

}
