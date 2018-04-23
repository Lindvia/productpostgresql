package com.belajar.controller

import com.belajar.model.Product
import com.belajar.repo.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class WebController {
    @Autowired
    lateinit var repository: ProductRepository

    @RequestMapping("/save")
    fun save(): String {
        repository.save(Product("Kaos", "Oblong"))
        repository.save(Product("Celana", "Jeans"))
        repository.save(Product("Celana", "Boxer"))
        repository.save(Product("Kemeja", "Kantor"))

        return "Done"
    }

    @RequestMapping("/findAll")
    fun findAll() = repository.findAll()

    @RequestMapping("/findById/{id}")
    fun findById(@PathVariable id: Long)
            = repository.findOne(id)

    @RequestMapping("findByLastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String)
            = repository.findByLastName(lastName)
}