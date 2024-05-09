package com.z2.movies.demo.reposity;

import com.z2.movies.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
