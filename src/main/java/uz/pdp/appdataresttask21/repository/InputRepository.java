package uz.pdp.appdataresttask21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask21.entity.Input;
import uz.pdp.appdataresttask21.projection.CustomInput;

@RepositoryRestResource(path = "input", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
