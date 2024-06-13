package com.springboot.Ecommerce.Backend.Repository;

import com.springboot.Ecommerce.Backend.Models.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionDAO extends JpaRepository<UserSession, Integer> {

    Optional<UserSession> findByToken(String token);

    Optional<UserSession> findByUserId(Integer userId);
}
