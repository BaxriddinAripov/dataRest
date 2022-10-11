package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Client;
import uz.pdp.appdataresttask21.entity.Currency;
import uz.pdp.appdataresttask21.entity.Output;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    Integer getWarehouse();
    Client getClient();
    Currency getCurrency();
    String getFactureName();
    String getCode();
}
