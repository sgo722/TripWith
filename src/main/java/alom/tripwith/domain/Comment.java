package alom.tripwith.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Comment {

    @Id
    @GeneratedValue
    private Long id;


    private Member member;

    private Board board;

    private int partnerId;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
