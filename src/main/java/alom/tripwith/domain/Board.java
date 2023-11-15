package alom.tripwith.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    private Member member;

    private String title;

    private String content;

    private String country;

    private String city;

    private LocalDateTime tripStart;

    private LocalDateTime tripEnd;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String pictures;

    private int likeCount;



}
