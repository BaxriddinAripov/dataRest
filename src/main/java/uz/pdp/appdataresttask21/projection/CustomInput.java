package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Currency;
import uz.pdp.appdataresttask21.entity.Input;
import uz.pdp.appdataresttask21.entity.Supplier;
import uz.pdp.appdataresttask21.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureName();
    String getCode();
}
