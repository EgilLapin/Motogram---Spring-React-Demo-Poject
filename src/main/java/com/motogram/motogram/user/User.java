package com.motogram.motogram.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "{motogram.constraints.username.NotNull.message}")
    @Size(min=4, max=255)
    @UniqueUsername
    private String username;

    @NotNull
    @Size(min=4, max=255)
    private String displayName;

    @NotNull
    @Size(min=8, max=255)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{motogram.constraints.password.Pattern.message}")
    public String password;
}
