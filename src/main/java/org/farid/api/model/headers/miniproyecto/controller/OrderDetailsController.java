package org.farid.api.model.headers.miniproyecto.controller;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.DetailOrderDTO;
import org.farid.api.model.headers.miniproyecto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ="/details")
public class OrderDetailsController {

    @Autowired
    private IService<DetailOrderDTO> detailService;

    @GetMapping("/get-details")
    public List<DetailOrderDTO> getAllProducts() { return detailService.listAll(); }

    @GetMapping(value = "/get-details-by-id/{id}")
    public DetailOrderDTO getProductById(@PathVariable Long id) throws BadRequestException {
        return detailService.getByid(id);
    }

    @DeleteMapping(value = "/delete-details/{id}")
    public void removerUser(@PathVariable Long id) {
        detailService.remover(id); }

    @PostMapping(value = "/add-details")
    public Map<String,String> addUser(@RequestBody DetailOrderDTO product, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Map<String,String> errors = new HashMap<>();
            bindingResult.getFieldErrors()
                    .forEach(error ->
                            errors.put(error.getField(),error.getDefaultMessage())
                    );
            return errors;

        }
        detailService.add(product);
        return Map.of("message","user added successfully");
    }
}
