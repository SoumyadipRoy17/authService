package org.example.repository;

import org.example.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);
}
