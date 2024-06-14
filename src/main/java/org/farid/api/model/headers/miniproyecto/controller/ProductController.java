package org.farid.api.model.headers.miniproyecto.controller;

import org.farid.api.model.headers.miniproyecto.dto.ProductDTO;
import org.farid.api.model.headers.miniproyecto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/product")
public class ProductController {

    @Autowired
    private IService<ProductDTO> productService;

    @GetMapping("/get-users")
    public List<ProductDTO> getAllProducts() { return productService.listAll(); }
}
