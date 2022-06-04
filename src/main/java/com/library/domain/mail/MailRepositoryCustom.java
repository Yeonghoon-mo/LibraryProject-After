package com.library.domain.mail;

import java.util.Optional;

public interface MailRepositoryCustom {

    /** 만료 여부 확인 */
    Optional<Mail> findValidAuthByEmail(final MailRequest params);

}
