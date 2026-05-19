package pl.edu.vistula.myfinaljavaproject.product.support;

import pl.edu.vistula.myfinaljavaproject.product.support.exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}