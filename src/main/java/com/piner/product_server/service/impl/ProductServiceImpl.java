package com.piner.product_server.service.impl;

import com.piner.product_server.domain.Product;
import com.piner.product_server.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Map<Integer,Product> daomap = new HashMap<>();
    private final Logger logger = LoggerFactory.getLogger(getClass());
    static {
        Product p1 = new Product(1,"iphonex",5555,9);
        Product p2= new Product(2,"oppo",231,7);
        Product p3 = new Product(3,"华为",6666,5);
        Product p4 = new Product(4,"步步高",2222,2);
        Product p5= new Product(5,"电脑",5555,3);
        daomap.put(p1.getId(),p1);
        daomap.put(p2.getId(),p2);
        daomap.put(p3.getId(),p3);
        daomap.put(p4.getId(),p4);
        daomap.put(p5.getId(),p5);

    }

    @Override
    public List<Product> listProduct() {

        Collection<Product> listProduct = daomap.values();
        List<Product> list= new ArrayList<>(listProduct);

        return list;
    }

    @Override
    public Product findbyid(int id) {
        logger.info("service findbyid");
        return daomap.get(id);
    }
}
