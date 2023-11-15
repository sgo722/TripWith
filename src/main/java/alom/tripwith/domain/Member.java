package alom.tripwith.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String birth;

    private String sex;

    private String profileImage;

    @Enumerated(EnumType.STRING)
    private Mbti mbti;

    private String instar;
}
