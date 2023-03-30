package ru.timofeev.projects.telegrambottranslator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import ru.timofeev.projects.telegrambottranslator.bot.TranslatorBot;

import java.util.Set;

@Configuration
public class SpringConfig {

    private final BotConfig botConfig;

    public SpringConfig(BotConfig botConfig) {
        this.botConfig = botConfig;
    }

    @Bean
    public SetWebhook setWebhookInstance() {
        return new SetWebhook(botConfig.getWebHookPath());
    }

    @Bean
    public TranslatorBot translatorBot(SetWebhook setWebhook) {
        TranslatorBot translatorBot = new TranslatorBot(setWebhook);

        translatorBot.setBotToken(botConfig.getBotToken());
        translatorBot.setBotUserName(botConfig.getBotUserName());
        translatorBot.setWebHookPath(botConfig.getWebHookPath());

        return translatorBot;
    }
}
