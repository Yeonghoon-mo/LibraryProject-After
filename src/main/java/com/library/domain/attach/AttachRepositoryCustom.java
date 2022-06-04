package com.library.domain.attach;

import java.util.List;

public interface AttachRepositoryCustom {

    // 게시판 파일 삭제처리
    void deleteAttach(Long boardId);

    // 게시판 파일 삭제
    long deleteAllByAttachIds(List<Long> attachIds);

    // 게시판 파일 삭제 취소
    void undeleteAttach(List<Long> fileId);

    // 파일 카운트
    Long selectAttachTotalCount(Long id);

    // 파일 목록 조회
    List<Attach> findByAttachList(Long id);

}
