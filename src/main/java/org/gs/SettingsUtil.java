package org.gs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingsUtil {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = SettingsUtil.class.getClassLoader().getResourceAsStream("settings.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load settings.properties", e);
        }
    }

    public static String getBotToken() {
        return properties.getProperty("bot.token");
    }

    public static Long getAdminChatId() {
        return Long.parseLong(properties.getProperty("bot.adminID"));
    }
}
