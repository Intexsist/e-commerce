/**
 * 
 */
package com.baeldung.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.ecommerce.model.OrderProduct;
import com.baeldung.ecommerce.model.OrderProductPK;

/**
 * @author Intexsist
 *
 */
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
