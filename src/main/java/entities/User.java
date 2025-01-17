package com.protifolio.programacao_web_unopar.entities;

import java.io.Serializable;

@Entity
@Table(name= "tb_user")
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String telephone;
    private String password;

    public User() {
    }

    public User() {

    }
    public User(String name, String email, String password, String telephone, Long id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void getId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void getTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != 0.getClass()) return false;
        User user = (User) o;

        return Objects.equals(id, user.id) &&
               Objects.equals(name, user.name) &&
               Objects.equals(email, user.email) &&
               Objects.equals(password, user.password) &&
               Objects.equals(telephone, user.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, telephone);
    }

}