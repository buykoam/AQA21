package models;

import lombok.*;

@Builder
@ToString
@EqualsAndHashCode
public class UserBuilder {
    @EqualsAndHashCode.Exclude
    private int id;
    private String username;
    private String password;
    private String email;
    private String username1;
    private String password1;

    @ToString.Exclude
    private String code;
}