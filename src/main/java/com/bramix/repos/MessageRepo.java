package com.bramix.repos;

import com.bramix.domain.Message;
import com.bramix.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MessageRepo extends JpaRepository <Message, Integer> {
    ArrayList<Message> findByTag (String tag);
    ArrayList<Message> findByAuthor (User user);
}
