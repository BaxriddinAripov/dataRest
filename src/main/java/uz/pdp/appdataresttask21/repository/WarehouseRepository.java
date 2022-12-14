package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.Warehouse;
import uz.pdp.appdataresttask21.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {


}
