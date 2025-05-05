package org.gs;

import org.gs.bot.MyBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ResourceBundle;

public class Main {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("settings");

    public static void main(String[] args) {

        try {
            TelegramBotsApi bot = new TelegramBotsApi(DefaultBotSession.class);
            MyBot myBot = new MyBot(resourceBundle.getString("bot.token"));
            bot.registerBot(myBot);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }
}






















