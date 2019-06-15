package com.bramix.repos;

import com.bramix.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {
    User findByUsername (String userName);
}
