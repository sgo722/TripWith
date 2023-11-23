package alom.tripwith.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "board")
    private List<Like> likes;

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
