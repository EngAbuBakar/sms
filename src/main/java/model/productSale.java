package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class productSale {

    @Id
    @Column
    private String productSaleId;
    @Column
    private String productSaleType;
    @Column
    private String productSaleDesc;

}
