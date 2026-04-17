package com.example.mystore.service;

import com.example.mystore.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
