package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.Measurement;
import uz.pdp.appdataresttask21.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
