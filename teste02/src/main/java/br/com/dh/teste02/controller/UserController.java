package br.com.dh.teste02.controller;

import br.com.dh.teste02.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDTO> newUser(@Valid @RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userDTO);
    }

}
