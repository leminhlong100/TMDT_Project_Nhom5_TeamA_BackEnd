package site.haloshop.backendtmdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.haloshop.backendtmdt.dto.SocialUser;
import site.haloshop.backendtmdt.entities.Account;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);



}