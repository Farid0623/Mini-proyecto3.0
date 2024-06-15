package org.farid.api.model.headers.miniproyecto.service;


import org.apache.coyote.BadRequestException;
import org.farid.api.model.headers.miniproyecto.dto.ProductDTO;
import org.farid.api.model.headers.miniproyecto.mapper.ProductMapper;
import org.farid.api.model.headers.miniproyecto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductImpl implements IService<ProductDTO>{

   @Autowired
   ProductRepository productRepository;
    @Override
    public List<ProductDTO> listAll() {
        return productRepository.findAll().stream()
                .map(ProductMapper::mapFrom)
                .collect(Collectors.toList());
    }

    @Override
    public void remover(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDTO add(ProductDTO user) {
        return ProductMapper
                .mapFrom(productRepository.save(ProductMapper.mapFromDto(user)));
    }

    @Override
    public ProductDTO getByid(Long id) throws BadRequestException {
        return ProductMapper.mapFrom(productRepository.findById(id).orElseThrow());
    }


}
