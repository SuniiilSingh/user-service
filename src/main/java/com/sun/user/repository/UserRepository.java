package com.sun.user.repository;

import com.sun.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    boolean existsByEmailId(String emailId);
}
