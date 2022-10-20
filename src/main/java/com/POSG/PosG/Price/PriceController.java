package com.POSG.PosG.Price;

import com.POSG.PosG.Product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    PriceRepository priceRepository;
    @PostMapping("/add")
    public PriceModel addPrice(@RequestBody PriceModel priceModel)
    {

          return priceRepository.save(priceModel);
    }
    @GetMapping("/{id}")
    public PriceModel getProduct(@PathVariable int id)
    {
        return priceRepository.findById((long) id).orElse(null);
    }
}
