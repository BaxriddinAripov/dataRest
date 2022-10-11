package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.Supplier;
import uz.pdp.appdataresttask21.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
