package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Attachment;
import uz.pdp.appdataresttask21.entity.Category;
import uz.pdp.appdataresttask21.entity.Measurement;
import uz.pdp.appdataresttask21.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto();
    String getCode();
    boolean getActive();
    Measurement getMeasurement();
}
