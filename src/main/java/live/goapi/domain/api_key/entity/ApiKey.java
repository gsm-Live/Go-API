package live.goapi.domain.api_key.entity;

import live.goapi.domain.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "api_key_id")
    private Long apiKeyId;

    @Column(name = "random_key")
    private String randomKey;

    @OneToOne
    @Column(name = "member_id")
    private Member member;
}
