package demo.kotlin.restful.service

import demo.kotlin.restful.model.CreateProductRequest
import demo.kotlin.restful.model.ListProductRequest
import demo.kotlin.restful.model.ProductResponse
import demo.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(CreateProductRequest: CreateProductRequest) : ProductResponse

    fun get(id : String) : ProductResponse

    fun update(id : String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id : String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}