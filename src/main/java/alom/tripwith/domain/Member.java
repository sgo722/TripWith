package alom.tripwith.domain;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    private Long id;
  
    @OneToMany(mappedBy = "member")
    private List<Board> board;
    private String name;

    @OneToMany(mappedBy = "member")
    private List<Like> like;

    private String birth;

    private String sex;

    private String profileImage;

    @Enumerated(EnumType.STRING)
    private Mbti mbti;

    private String instar;

    @OneToMany(mappedBy = "member")
    private List<Chat> chats;

}
