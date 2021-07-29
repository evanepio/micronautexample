package ca.evanepio.micronaut.example.data;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Optional;

@Controller("/product")
public class ProductController {

    ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @Get("/{id}")
    public Optional<Product> getProduct(String id) {
        return repo.findById(id);
    }
}
