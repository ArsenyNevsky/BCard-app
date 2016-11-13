package ru.nevars.bcard.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserRole implements Serializable {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private Role role;

    public String getRole() {
        return role.toString();
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role);
    }

    private enum Role {
        ADMIN, SUPERADMIN, COOK, CHEF, GUEST
    }
}
