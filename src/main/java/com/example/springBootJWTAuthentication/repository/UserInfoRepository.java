package com.example.springBootJWTAuthentication.repository;

import com.example.springBootJWTAuthentication.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByEmail(String email);

    Optional<UserInfo> findByName(String name);


}
