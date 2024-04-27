package site.haloshop.backendtmdt.controller;

import org.apache.coyote.http11.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;
import site.haloshop.backendtmdt.dto.SocialUser;
import site.haloshop.backendtmdt.entities.Account;
import site.haloshop.backendtmdt.mapper.SocialUserMapper;
import site.haloshop.backendtmdt.service.AccountOAuth2UserService;


import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@RestController
public class GoogleLoginController {
@Autowired
    AccountOAuth2UserService accountOAuth2UserService;

@GetMapping("/user")
    public Map<String,Object> getUser(@AuthenticationPrincipal OAuth2User oAuth2User){
    String email = (String) oAuth2User.getAttribute("email");
    String name = (String) oAuth2User.getAttribute("name");
    String givenName = (String) oAuth2User.getAttribute("given_name");
    String id = (String) oAuth2User.getAttribute("sub");
    String pictureUrl = (String) oAuth2User.getAttribute("picture");
Account socialUser = accountOAuth2UserService.findByEmail(email);
    Date now = java.sql.Date.valueOf(LocalDate.now()) ;
    if(socialUser == null){

        SocialUser socialUser1 = new SocialUser(name,name,id,email,pictureUrl,id,now);
        accountOAuth2UserService.createAccount(socialUser1);
    }
    return  oAuth2User.getAttributes();

}

}