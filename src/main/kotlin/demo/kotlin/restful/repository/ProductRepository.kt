package demo.kotlin.restful.repository

import demo.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product,String> {

}