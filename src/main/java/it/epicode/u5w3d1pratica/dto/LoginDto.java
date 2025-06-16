package it.epicode.u5w3d1pratica.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
    @Email
    @NotEmpty(message="userName non può essere vuoto")
    private String email;
    @NotEmpty(message="password non può essere vuoto")
    private String password;
}
