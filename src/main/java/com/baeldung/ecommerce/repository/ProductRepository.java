/**
 * 
 */
package com.baeldung.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.ecommerce.model.Product;

/**
 * @author Intexsist
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
