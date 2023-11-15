package alom.tripwith.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Like {

    @Id
    @GeneratedValue
    private Long id;

    private Member member;

    private Board board;
}
