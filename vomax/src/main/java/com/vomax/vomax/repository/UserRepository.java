package com.vomax.vomax.repository;
import com.vomax.vomax.Database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {


@Query(value = "Select c from User c Where c.username = ?1")
Optional<User> findByUsername(String username);
}