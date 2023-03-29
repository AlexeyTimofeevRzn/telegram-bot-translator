package ru.timofeev.projects.telegrambottranslator.bot;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TranslatorBot extends TelegramWebhookBot {
    String webHookPath;
    String botUserName;
    String botToken;

    public TranslatorBot(DefaultBotOptions options) {
        super(options);
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotPath() {
        return webHookPath;
    }

    @Override
    public String getBotUsername() {
        return botUserName;
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
