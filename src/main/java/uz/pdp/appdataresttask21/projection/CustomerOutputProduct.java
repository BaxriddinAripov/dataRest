package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Output;
import uz.pdp.appdataresttask21.entity.OutputProduct;
import uz.pdp.appdataresttask21.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomerOutputProduct {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
