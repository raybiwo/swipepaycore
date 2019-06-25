package com.swipepay.core.repository;

import com.swipepay.core.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);

//    @Query("select a.password from Users a where a.username=:username")
//    public Object[] getPassword(@Param("username") String username);
}
