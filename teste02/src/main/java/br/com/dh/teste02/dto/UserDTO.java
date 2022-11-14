package br.com.dh.teste02.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDTO {

    @NotBlank (message = "O nome é obrigatório")
    private String name;

    @NotBlank (message = "o email é obrigatório")
    @Email (message = "o email deve ser válido")
    private String email;

    @Min(value = 18, message = "A idade mínima é de 18 anos")
    private int idade;

}
