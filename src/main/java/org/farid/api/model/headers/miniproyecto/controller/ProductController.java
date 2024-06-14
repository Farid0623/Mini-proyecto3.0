package org.farid.api.model.headers.miniproyecto.controller;

import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.ProductDTO;
import org.farid.api.model.headers.miniproyecto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ="/product")
public class ProductController {

    @Autowired
    private IService<ProductDTO> productService;

    @GetMapping("/get-users")
    public List<ProductDTO> getAllProducts() { return productService.listAll(); }
    @GetMapping(value = "/get-product-by-id/{id}")
    public ProductDTO getProductById(@PathVariable Long id) throws BadRequestException {
        return productService.getByid(id);
    }

    @DeleteMapping(value = "/delete-product/{id}")
    public void removerUser(@PathVariable Long id) {
        productService.remover(id); }

    @PostMapping(value = "/add-product")
    public Map<String,String> addUser(@RequestBody ProductDTO product, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Map<String,String> errors = new HashMap<>();
            bindingResult.getFieldErrors()
                    .forEach(error ->
                            errors.put(error.getField(),error.getDefaultMessage())
                    );
            return errors;

        }
        productService.add(product);
        return Map.of("message","user added successfully");
    }
}
