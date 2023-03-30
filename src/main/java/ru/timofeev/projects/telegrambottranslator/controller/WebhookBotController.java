package ru.timofeev.projects.telegrambottranslator.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import ru.timofeev.projects.telegrambottranslator.bot.TranslatorBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebhookBotController {

    private final TranslatorBot translatorBot;

    public WebhookBotController(TranslatorBot translatorBot) {
        this.translatorBot = translatorBot;
    }

    @PostMapping("/")
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return translatorBot.onWebhookUpdateReceived(update);
    }
}
