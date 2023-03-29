package ru.timofeev.projects.telegrambottranslator.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestAndResponseDTO {

    private String request;

    private String response;

}
