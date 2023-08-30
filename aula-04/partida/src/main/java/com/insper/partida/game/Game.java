package com.insper.partida.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Game {

    @Id
    private String id;

    private String identifier;

    private String home;

    private String away;

    private Integer scoreHome;

    private Integer scoreAway;

    private Integer attendance;

    private LocalDateTime gameDate;

    private String status;

}
