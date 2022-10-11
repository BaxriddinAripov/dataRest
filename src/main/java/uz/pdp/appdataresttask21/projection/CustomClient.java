package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
