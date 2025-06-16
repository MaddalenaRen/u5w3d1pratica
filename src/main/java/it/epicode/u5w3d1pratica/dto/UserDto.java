package it.epicode.u5w3d1pratica.dto;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDto {
    @NotEmpty(message="il nome non può essere vuoto")
    private String nome;
    @NotEmpty(message="il cognome non può essere vuoto")
    private String cognome;
    @NotEmpty(message="userName non può essere vuoto")
    private String userName;
    @NotEmpty(message="password non può essere vuoto")
    private String password;
}
