package com.ctac.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    Product p = new Product("Test product", 10, 3);
    @Test
    void testTotalCost() {
        assertEquals("Total cost is 30.0", p.totalCost(3));
    }

    @Test
    void testTotalCostIfOutOfStock() {
        assertEquals("\nSorry, we do not have enough product for this order.", p.totalCost(4));
    }

    @Test
    void testPrintProduct() {
        p.totalCost(3);
        assertEquals("\nTest product costs $10.0 and 3 were purchased", p.printProduct());
    }

}
