package com.epam.brest.calc;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class CalcImpl implements Calc {
    @Override
    public BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal distance, BigDecimal pricePerKm) {
        if (weight == null|| distance==null){throw new IllegalArgumentException("Write value can not be NULL");}
        return weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));

    }
}
