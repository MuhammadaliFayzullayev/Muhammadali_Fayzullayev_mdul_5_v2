package org.gs;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import org.gs.bot.BotConfig;
import org.gs.controller.AdminController;
import org.gs.controller.UserController;
import org.gs.entity.User;
import org.gs.repository.HomeworkRepository;
import org.gs.repository.UserRepository;
import org.gs.service.HomeworkService;
import org.gs.service.UserService;


import java.util.ResourceBundle;

public class Main {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("settings");

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        HomeworkRepository homeworkRepository = new HomeworkRepository();

        UserService userService = new UserService(userRepository);
        HomeworkService homeworkService = new HomeworkService(homeworkRepository);


        UserController userController = new UserController(userService, homeworkService);
        AdminController adminController = new AdminController(userService, homeworkService);


        TelegramBot bot = BotConfig.getBot();

        if (userRepository.findByChatId(BotConfig.getAdminId()).isEmpty()) {
            User admin = new User(BotConfig.getAdminId(), "Admin", "", "admin");
            userRepository.save(admin);
        }

        bot.setUpdatesListener(updates -> {
            for (Update update : updates) {
                if (update.message() != null) {
                    Long chatId = update.message().chat().id();

                    if (chatId.equals(BotConfig.getAdminId())) {
                        adminController.handleUpdate(update);
                    } else {
                        userController.handleUpdate(update);
                    }
                }
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }
}






















