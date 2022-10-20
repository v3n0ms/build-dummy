package com.POSG.PosG.Product;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @PostMapping("/add")
    public ProductModel addProduct(@RequestBody ProductModel productModel)
    {
        return productRepository.save(productModel);
    }
}
