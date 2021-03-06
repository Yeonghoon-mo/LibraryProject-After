package com.library.domain.comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>, CommentRepositoryCustom {

}
