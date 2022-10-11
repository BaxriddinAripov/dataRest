package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Input;
import uz.pdp.appdataresttask21.entity.InputProduct;
import uz.pdp.appdataresttask21.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpireDate();
    Input getInput();
}
