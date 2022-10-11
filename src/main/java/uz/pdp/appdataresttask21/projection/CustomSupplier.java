package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    String getActive();
    String getPhoneNumber();
}
