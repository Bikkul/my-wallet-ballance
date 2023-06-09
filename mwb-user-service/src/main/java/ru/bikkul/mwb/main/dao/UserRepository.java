package ru.bikkul.mwb.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bikkul.mwb.main.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
