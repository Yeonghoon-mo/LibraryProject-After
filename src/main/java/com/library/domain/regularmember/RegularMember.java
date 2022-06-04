package com.library.domain.regularmember;

import com.library.domain.member.Member;
import com.library.domain.member.MemberRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "tb_regular_member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RegularMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String phone;                   // 연락처
    private String socialPosition;          // 사회적 직함
    private String education;               // 학력
    private String career;                  // 경력
    private String book;                    // 저서

    @Builder
    public RegularMember(Member member, String phone, String socialPosition, String education, String career, String book){
        this.member = member;
        this.phone = phone;
        this.socialPosition = socialPosition;
        this.education = education;
        this.career = career;
        this.book = book;
    }

    // 정회원 수정
    public void update(MemberRequest params){
        this.phone = params.getPhone();
        this.socialPosition = params.getSocialPosition();
        this.education = params.getEducation();
        this.career = params.getCareer();
        this.book = params.getBook();
    }

}
