/**
 * 
 */
package com.baeldung.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.ecommerce.model.Order;

/**
 * @author Intexsist
 *
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
