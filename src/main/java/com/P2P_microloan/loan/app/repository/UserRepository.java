package com.P2P_microloan.loan.app.repository;

import com.P2P_microloan.loan.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
