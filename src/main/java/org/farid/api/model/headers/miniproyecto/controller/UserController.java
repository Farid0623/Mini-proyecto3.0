package org.farid.api.model.headers.miniproyecto.controller;


import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.ProductDTO;
import org.farid.api.model.headers.miniproyecto.dto.UserDTO;
import org.farid.api.model.headers.miniproyecto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ="/users")
public class UserController {

    @Autowired
    private IService<UserDTO> userService;

    @GetMapping("/get-users")
    public List<UserDTO> getAllProducts() { return userService.listAll(); }

    @GetMapping(value = "/get-user-by-id/{id}")
    public UserDTO getProductById(@PathVariable Long id) throws BadRequestException {
        return userService.getByid(id);
    }

    @DeleteMapping(value = "/delete-user/{id}")
    public void removerUser(@PathVariable Long id) {
        userService.remover(id); }

    @PostMapping(value = "/add-user")
    public Map<String,String> addUser(@RequestBody UserDTO product, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Map<String,String> errors = new HashMap<>();
            bindingResult.getFieldErrors()
                    .forEach(error ->
                            errors.put(error.getField(),error.getDefaultMessage())
                    );
            return errors;

        }
        userService.add(product);
        return Map.of("message","user added successfully");
    }
}
