package uz.pdp.appdataresttask21.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appdataresttask21.entity.template.AbsEntity;

import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbsEntity {
}
