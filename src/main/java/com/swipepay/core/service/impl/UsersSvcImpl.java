package com.swipepay.core.service.impl;

import com.swipepay.core.model.Users;
import com.swipepay.core.repository.UsersRepo;
import com.swipepay.core.service.UsersSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service(value = "users")
@Transactional
public class UsersSvcImpl implements UserDetailsService, UsersSvc {

    @Autowired
    UsersRepo usersRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepo.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

    public List<Users> findAll() {
        List<Users> list = new ArrayList<>();
        usersRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id) {
        usersRepo.delete(id);
    }

    @Override
    public Users save(Users user) {
        return usersRepo.save(user);
    }




//    @Override
//    public String getPassword(String username) {
//        UsersDto usersDto = new UsersDto();
//        Object[] obj = usersRepo.getPassword(username);
//
//        String password = (String) obj[0];
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String hashedPassword = passwordEncoder.encode(password);
//        return hashedPassword;
//    }
}
