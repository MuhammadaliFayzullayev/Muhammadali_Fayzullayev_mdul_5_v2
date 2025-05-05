package org.gs.bot;

import com.pengrad.telegrambot.model.request.Keyboard;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Arrays;


public class MyBot extends TelegramLongPollingBot {


    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage() != null){
            Long chatId = update.getMessage().getChatId();
            if (update.getMessage().getText().equals("/start"));
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Welcome User!");
            KeyboardButton[] buttons = new KeyboardButton[]{
                    new KeyboardButton("Send homeworks"),
                    new KeyboardButton("Show old homeworks")
            };



            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.hasCallbackQuery()) {

        }else {

        }
    }



    @Override
    public String getBotUsername() {
        return "g52_exam_bot";
    }
}








