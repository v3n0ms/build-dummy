package com.POSG.PosG;

import com.POSG.PosG.Price.PriceController;
import com.POSG.PosG.Price.PriceModel;
import com.POSG.PosG.Price.PriceRepository;
import com.POSG.PosG.Product.ProductModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
import java.util.Optional;

import static com.POSG.PosG.Price.Currency.INR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PriceControllerTest {
    @Autowired
    private PriceController priceController;
    @MockBean
    private PriceRepository priceRepository;
    @Test
    public void addPrice()
    {
        PriceModel priceModel=new PriceModel(1L,10,new Date(2022-02-25),new Date(2022-12-25),124356,INR);

        when(priceRepository.save(priceModel)).thenReturn(priceModel);

        assertEquals(priceModel,priceController.addPrice(priceModel));
    }

    @Test
    public void getPriceDescriptionById()
    {
        PriceModel priceModel=new PriceModel(1L,10,new Date(2022-02-25),new Date(2022-12-25),124356,INR);

        when(priceRepository.findById((long) priceModel.getId())).thenReturn(Optional.of(priceModel));

        assertEquals(priceModel,priceController.getProduct((int) priceModel.getId()));


    }
}
