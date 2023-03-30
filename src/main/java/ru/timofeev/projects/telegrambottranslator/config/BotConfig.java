package ru.timofeev.projects.telegrambottranslator.config;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotConfig {

    @Value("${telegram.bot.webHookPath")
    String webHookPath;

    @Value("${telegram.bot.name}")
    String botUserName;

    @Value("${telegram.bot.token}")
    String botToken;

}
