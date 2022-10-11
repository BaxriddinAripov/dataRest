package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean getActive();

}
