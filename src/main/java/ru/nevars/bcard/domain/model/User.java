package ru.nevars.bcard.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String firstname;

    private String middlename;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private UserRole role;

    private Boolean isActive;

    @Override
    public int hashCode() {
        return  id +
                firstname.hashCode() +
                lastname.hashCode() +
                login.hashCode() +
                email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        User that = (User) obj;
        if (this.email.equals(that.email) &&
            this.password.equals(that.password) &&
            this.login.equals(that.login)) {
            return true;
        }
        return false;
    }
}
