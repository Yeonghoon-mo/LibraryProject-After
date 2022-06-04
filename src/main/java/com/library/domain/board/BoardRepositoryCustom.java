package com.library.domain.board;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardRepositoryCustom {

    /** Pagination */
    Page<Board> findAll(BoardInquirySearchCondition condition, Pageable pageable);

    /** 인덱스 리스트 */
    List<Board> findByBoardIndexList(BoardInquirySearchCondition condition);

}
