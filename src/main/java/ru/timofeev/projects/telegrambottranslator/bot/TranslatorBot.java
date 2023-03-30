package ru.timofeev.projects.telegrambottranslator.bot;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.starter.SpringWebhookBot;

@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TranslatorBot extends SpringWebhookBot {
    String webHookPath;
    String botUserName;
    String botToken;

    public TranslatorBot(DefaultBotOptions options, SetWebhook setWebhook) {
        super(options, setWebhook);
    }

    public TranslatorBot(SetWebhook setWebhook) {
        super(setWebhook);
    }

    @Override
    public String getBotToken() {
        return this.botToken;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotPath() {
        return this.webHookPath;
    }

    @Override
    public String getBotUsername() {
        return this.botUserName;
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }

}
