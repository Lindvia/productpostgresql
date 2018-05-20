package com.belajar.controller

import com.belajar.model.Product
import com.belajar.repo.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping ("/api")
class WebController {
    @Autowired
    lateinit var repository: ProductRepository

    @RequestMapping("/save")
    fun save(): String {
        repository.save(Product("Kaos", "Oblong"))
        repository.save(Product("Celana", "Jeans"))
        repository.save(Product("Celana", "Panjang"))
        repository.save(Product("Kemeja", "Kantor"))

        return "Done"
    }

    @GetMapping("/findAll")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addProduct(@RequestBody product: Product)
            = repository.save(product)

    @PutMapping("/{id}")
    fun updateProduct(@PathVariable id: Long, @RequestBody product: Product) {
        assert(product.id == id)
        repository.save(product)
    }

    @PostMapping("/findById/{id}")
    fun findById(@PathVariable id: Long)
            = repository.findOne(id)

    @PostMapping("api/findByLastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String)
            = repository.findByLastName(lastName)

    @DeleteMapping("/{id}")
    fun removeProduct(@PathVariable id: Long)
            = repository.delete(id)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long)
            = repository.findOne(id)
}