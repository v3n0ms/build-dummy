package com.POSG.PosG.Price;

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

}
