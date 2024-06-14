package org.farid.api.model.headers.miniproyecto.controller;


import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.DetailOrderDTO;
import org.farid.api.model.headers.miniproyecto.dto.OrderDTO;
import org.farid.api.model.headers.miniproyecto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ="/orders")
public class OrderController {

    @Autowired
    private IService<OrderDTO> orderService;

    @GetMapping("/get-order")
    public List<OrderDTO> getAllProducts() { return orderService.listAll(); }

    @GetMapping(value = "/get-order-by-id/{id}")
    public OrderDTO getProductById(@PathVariable Long id) throws BadRequestException {
        return orderService.getByid(id);
    }

    @DeleteMapping(value = "/delete-details/{id}")
    public void removerUser(@PathVariable Long id) {
        orderService.remover(id); }

    @PostMapping(value = "/add-details")
    public Map<String,String> addUser(@RequestBody OrderDTO product, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Map<String,String> errors = new HashMap<>();
            bindingResult.getFieldErrors()
                    .forEach(error ->
                            errors.put(error.getField(),error.getDefaultMessage())
                    );
            return errors;

        }
        orderService.add(product);
        return Map.of("message","user added successfully");
    }
}


