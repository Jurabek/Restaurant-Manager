package com.jurabek.restaurant.order.api.dtos;

import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerBasketItemDtoTest {
    @Test
    public void testGetterAndSetters() {
        assertThat(CustomerBasketItemDto.class, allOf(
                hasValidGettersAndSetters()
        ));
    }
}
