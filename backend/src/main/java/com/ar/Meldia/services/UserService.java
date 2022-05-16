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
    
    public List<User> findAllVIP() {
        return service.findAllVIP();
    }

    public List<User> findNewUserVIP() {
        return service.findNewUserVIP();
    }

    @Override
    public Integer updateDateVIP(String dni, String date) {
        return service.updateDateUserVIP(dni, date);
    }

    @Override
    public List<User> findNoVIP() {
        return service.findNoVIP();
    }

    @Override
    public List<User> findUserVIP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
