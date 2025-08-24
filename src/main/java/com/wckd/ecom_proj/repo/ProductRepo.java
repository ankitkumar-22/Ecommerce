package com.wckd.ecom_proj.repo;

import com.wckd.ecom_proj.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepo extends MongoRepository<Product,String> {

}
