package com.sparata.week04.controller;

import com.sparata.week04.models.Product;
import com.sparata.week04.models.ProductMypriceRequestDto;
import com.sparata.week04.models.ProductRepository;
import com.sparata.week04.models.ProductRequestDto;
import com.sparata.week04.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor//final 로 선언된 멤버 변수를 자동으로 생성
@RestController//JSON 데이터 주고 받음 선언
public class ProductRestController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) {
        Product product = new Product(requestDto);
        return productRepository.save(product);
    }

    @PutMapping("/api/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.update(id, requestDto);
    }
}
