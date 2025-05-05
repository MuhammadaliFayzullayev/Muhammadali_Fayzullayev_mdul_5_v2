package org.gs.repository;

import org.gs.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public Optional<User> findByChatId(Long chatId) {
        return users.stream()
                .filter(user -> user.getChatId().equals(chatId))
                .findFirst();
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}
