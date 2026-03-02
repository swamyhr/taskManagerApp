package com.taskmanager.api.repository;

import com.taskmanager.api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    boolean existsByEmail(String email);

    @Query("Select u.password From UserEntity u where u.email = :email")
    Optional<String> getPasswordByEmail(@Param("email")String email);
}
