package com.ar.Meldia.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "dni")
    private String dni;

    @Column(name = "date")
    private Date date;

    public User() {
    }

    public User(Integer id, String name, String lastName, String dni, String privilege) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.privilege = privilege;
    }

    @Column(name = "privilege")
    private String privilege;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", date=" + date + ", privilege=" + privilege + '}';
    }

}
