package com.ar.Meldia.dao;

import com.ar.Meldia.models.User;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface IUserDao extends JpaRepository<User, Integer> {

    //query personalizado para la busqueda de usuarios por DNI
    @Query(value = "SELECT * FROM Users WHERE dni = ?1", nativeQuery = true)
    public Optional<User> findByDni(String dni);

    //query personalizado para la busqueda de usuarios VIP
    @Query(value = "SELECT * FROM users WHERE MONTH(date)=MONTH(CURRENT_DATE()) AND privilege = 'VIP'", nativeQuery = true)
    public List<User> findUserVIP();

    //query personalizado para la busqueda de usuarios VIP   
    @Modifying
    @Transactional
    @Query(value = "UPDATE `supermarket`.`users` SET `date` = :date, `privilege` = 'VIP' WHERE (`dni` = :dni)", nativeQuery = true)
    public Integer updateDateUserVIP(@Param("dni") String dni, @Param("date") String date);

    @Query(value = "SELECT * FROM supermarket.users WHERE privilege = 'COMUN';", nativeQuery = true)
    public List<User> findNoVIP();
}
