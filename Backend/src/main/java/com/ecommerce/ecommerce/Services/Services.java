package com.ecommerce.ecommerce.Services;

import com.ecommerce.ecommerce.api.Model.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public interface Services {
    List<AbstractReadWriteAccess.Item> filterItems(String category, double minPrice, double maxPrice);
}
