package site.haloshop.backendtmdt.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.SocialUser;
import site.haloshop.backendtmdt.entities.Account;
import site.haloshop.backendtmdt.mapper.SocialUserMapper;
import site.haloshop.backendtmdt.repository.UserRepository;

@Service
@AllArgsConstructor
public class AccountOAuth2UserService {
    private final UserRepository userRepository;

    public Account findByEmailGoogle(String email) {
        return userRepository.findByEmailGoogle(email);
    }
    public Account findByEmailFacebook(String email){
       return userRepository.findByEmailFacebook(email);
    }

    public SocialUser createAccount(SocialUser socialUser) {
        Account account = SocialUserMapper.mapToAccount(socialUser);
        Account addAccount = userRepository.save(account);
        return SocialUserMapper.mapToDTO(addAccount);
    }
}
