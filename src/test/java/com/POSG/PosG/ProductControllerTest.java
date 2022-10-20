package com.POSG.PosG;

import com.POSG.PosG.Price.PriceModel;
import com.POSG.PosG.Product.ProductController;
import com.POSG.PosG.Product.ProductModel;
import com.POSG.PosG.Product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {
    @Autowired
    private ProductController productController;
    @MockBean
    private ProductRepository productRepository;

    @Test
    void shouldAddProduct()
    {
        ProductModel productModel=new ProductModel(1L,10,"apple",new PriceModel());

        when(productRepository.save(productModel)).thenReturn(productModel);

        assertEquals(productModel,productController.addProduct(productModel));
    }
}
