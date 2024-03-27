package com.adamrak.githubuserrequest.repository;

import com.adamrak.githubuserrequest.model.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest,Integer> {
    boolean existsByLogin(String login);
    Optional<UserRequest> findByLogin(String login);
}
