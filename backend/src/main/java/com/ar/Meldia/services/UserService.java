package com.ar.Meldia.services;

import com.ar.Meldia.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.ar.Meldia.dao.IUserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Autowired
    private IUserDao service;

    @Override
    public Optional<User> findUser(User u) {
        return service.findByDni(u.getDni());
    }

    public List<User> findAll() {
        return service.findAll();
    }

    @Override
    public List<User> findUserVIP() {
        return service.findUserVIP();
    }

    @Override
    public Integer updateDateVIP(String dni, String date) {
        return service.updateDateUserVIP(dni, date);
    }

    @Override
    public List<User> findNoVIP() {
        return service.findNoVIP();
    }

}
