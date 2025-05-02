package com.P2P_microloan.loan.app.model;

import com.P2P_microloan.loan.app.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String username;

    @Column(nullable = false)
    private String password;

//    @Column(nullable = false, unique = true)
//    private String email;
//
//    private String phone;
//
//    private boolean isVerified = false;
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private Role role;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
