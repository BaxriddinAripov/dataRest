package uz.pdp.appdataresttask21.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask21.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    Category getParentCategory();
    boolean getActive();
}
