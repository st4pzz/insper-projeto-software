package com.insper.user.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class User {

    @Id
    private String id;
    private String email;
    private String password;
    private List<String> roles;
}
