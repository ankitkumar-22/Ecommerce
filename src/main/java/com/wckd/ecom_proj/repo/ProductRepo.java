package com.wckd.ecom_proj.repo;

import com.wckd.ecom_proj.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface ProductRepo extends MongoRepository<Product,String> {
    @Query("{ '$or': [ { 'name': { $regex: ?0, $options: 'i' } }, { 'brand': { $regex: ?0, $options: 'i' } } ] }")
    List<Product> searchProducts(String keyword);
}
