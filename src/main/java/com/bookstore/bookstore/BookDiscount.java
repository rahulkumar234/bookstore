package com.bookstore.bookstore;

import java.util.HashMap;
import java.util.Map;

public class BookDiscount {
    public final static Map<String, Integer> discountMap;
    static {
        discountMap = new HashMap<>();
        discountMap.put("FIC10", 10);
    }

    public static Map<String, Integer> getDiscountMap() {
        return discountMap;
    }
}
