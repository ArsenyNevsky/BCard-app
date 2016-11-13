package ru.nevars.bcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nevars.bcard.domain.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
