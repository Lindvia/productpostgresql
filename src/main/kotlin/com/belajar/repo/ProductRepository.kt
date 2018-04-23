package com.belajar.repo

import com.belajar.model.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository : CrudRepository<Product, Long> {
    fun findByLastName(lastName: String): Iterable<Product>
}