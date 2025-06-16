package it.epicode.u5w3d1pratica.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
    @NotEmpty(message="userName non può essere vuoto")
    private String userName;
    @NotEmpty(message="password non può essere vuoto")
    private String password;
}
