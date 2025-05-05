package org.gs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long chatId;
    private String firstName;
    private String lastName;
    private String username;
    private UserState userState;

}
