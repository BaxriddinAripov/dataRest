package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.Product;
import uz.pdp.appdataresttask21.projection.CustomProduct;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
