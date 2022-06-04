package com.library.domain.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentListResponse {

    private Long commentId;
    private Long memberId;
    private String memberName;
    private String profileImage;
    private String content;
    private Integer likeType;
    private int likeCnt;
    private int badCnt;
    private LocalDateTime createdDate;

}
