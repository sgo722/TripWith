package alom.tripwith.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;


@Entity
@Getter
public class ChatContent {

    @Id
    @GeneratedValue
    private Long id;

    private Chat chat;

    private Member member;

    private String content;

    private LocalDateTime sendAt;
}
