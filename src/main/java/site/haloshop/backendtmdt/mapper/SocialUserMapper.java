package site.haloshop.backendtmdt.mapper;

import site.haloshop.backendtmdt.dto.SocialUser;
import site.haloshop.backendtmdt.entities.Account;

public class SocialUserMapper {
    public static SocialUser mapToDTO(Account account) {
        return new SocialUser(
                account.getAccountName(), account.getFullName(),account.getPassword(), account.getEmail(), account.getImage(), account.getIdOther(),account.getCreateAt(), account.getType()
        );
    }

    public static Account mapToAccount(SocialUser socialUser) {
        return new Account(socialUser.getAccountName(), socialUser.getFullName(),socialUser.getPassword() ,socialUser.getEmail(), socialUser.getImage(), socialUser.getIdOther(),socialUser.getCreate_at(), socialUser.getType());
    }
}
