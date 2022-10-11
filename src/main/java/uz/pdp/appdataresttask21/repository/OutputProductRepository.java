package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.OutputProduct;
import uz.pdp.appdataresttask21.projection.CustomerOutputProduct;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list", excerptProjection = CustomerOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
