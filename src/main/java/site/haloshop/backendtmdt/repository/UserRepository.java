package site.haloshop.backendtmdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import site.haloshop.backendtmdt.dto.SocialUser;
import site.haloshop.backendtmdt.entities.Account;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    @Query( "SELECT a from Account a where a.email= :email and a.type = 2 and  a.isActive  = '1'" )
    Account findByEmailGoogle(String email);

    @Query( "SELECT a from Account a where a.email = :email and a.type = 3 and  a.isActive  = '1'" )
   Account findByEmailFacebook(String email);

}