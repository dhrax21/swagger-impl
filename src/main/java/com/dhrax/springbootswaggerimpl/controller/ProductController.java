package com.dhrax.springbootswaggerimpl.controller;

import com.dhrax.springbootswaggerimpl.entity.Product;
import com.dhrax.springbootswaggerimpl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addprod")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/addprods")
    public List<Product> addProducts(@RequestBody List<Product> productList){
        return productService.saveProductList(productList);
    }
    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProduct(id);
    }

}
