package ru.timofeev.projects.telegrambottranslator.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BotConfig {

    @Value("${telegram.bot.webHookPath")
    String webHookPath;

    @Value("${telegram.bot.name}")
    String botName;

    @Value("${telegram.bot.token}")
    String botToken;

}
