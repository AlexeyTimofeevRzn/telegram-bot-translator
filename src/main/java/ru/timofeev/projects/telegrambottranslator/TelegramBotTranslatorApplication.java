package ru.timofeev.projects.telegrambottranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@ComponentScan("org.telegram.telegrambots")
@ComponentScan("ru.timofeev.projects.telegrambottranslator")
public class TelegramBotTranslatorApplication {

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

        SpringApplication.run(TelegramBotTranslatorApplication.class, args);
    }

}
