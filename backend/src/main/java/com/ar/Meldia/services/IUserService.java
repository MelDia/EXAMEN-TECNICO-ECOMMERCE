package com.ar.Meldia.services;

import com.ar.Meldia.models.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {

    Optional<User> findUser(User u);

    List<User> findUserVIP();

    Integer updateDateVIP(String dni, String date);

    List<User> findNoVIP();
}
