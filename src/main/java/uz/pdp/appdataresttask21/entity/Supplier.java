package uz.pdp.appdataresttask21.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appdataresttask21.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Supplier extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
